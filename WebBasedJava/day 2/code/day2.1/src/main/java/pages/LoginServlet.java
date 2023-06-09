package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		try {
			// create dao instance
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// re throw the exc to the caller (WC) , so that WC DOES NOT continue with the
			// rest of the servlet life cycle
			throw new ServletException("err in init of " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			// clean up dao
			userDao.cleanUp();
		} catch (Exception e) {
			System.out.println("err in destroy of " + getClass() + " " + e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. set resp content type
		response.setContentType("text/html");
		// 2 get PW
		try (PrintWriter pw = response.getWriter()) {
			// 3. get req params(em, pass) sent from the clnt
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			// 4. invoke dao's method for user authentication
			User user = userDao.authenticateUser(email, pwd);
			if (user == null) // login failed
				pw.print("<h4> Invalid Email or Password , Please <a href='login.html'>Retry</a></h4>");
			else {// =>success , send user details
				pw.print("<h4> Validated User details " + user + "</h4>");
		//		pw.flush();//sending the resp (commiting the resp)
				// role based authorization
				if (user.getRole().equals("admin")) {
					// redirect the clnt to admin page
					// API of HttpServletResponse : public void sendRedirect(String redirectURI)
					// throws IOExc.
					response.sendRedirect("admin_page");
				} else // voter
				if (user.isVotingStatus()) {// alrdy voted
					// redirect to logout page
					response.sendRedirect("logout");
				} else {
					// not yet voted
					// redirect to candidate list page
					response.sendRedirect("candidate_list");
					//WC sends temp redirect resp : SC 302 | location=candidate_list | body : EMPTY
					//web browser : sends NEXT request : http://host:port/day2.1/candidate_list, method =GET
					//--WC --public service(rq,rs) -->protected service --> doGet 

				}

			}

		} // pw.flush --> pw.close --resp is committed(rendered/sent)
		catch (Exception e) {
			// re throw the exc to the WC , to inform about the err
			throw new ServletException("err in do-get " + getClass(), e);
		}
	}

}
