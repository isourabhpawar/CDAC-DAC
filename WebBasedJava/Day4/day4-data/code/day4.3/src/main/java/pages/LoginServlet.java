package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidateDaoImpl;
import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;
	private CandidateDaoImpl candidateDao;

	// def ctor : added only for understanding!
	public LoginServlet() {
		System.out.println("in def ctor of " + getClass() + " config " + getServletConfig());// null
	}
	//This will NOT be invoked!!!!
	public LoginServlet(String url, String userName, String pwd) {
		System.out.println("in parameterized ctor ");
	}

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		//get servlet config
		ServletConfig config=getServletConfig();
		System.out.println("in init of " + getClass() + " config " +config);//not null

		try {			
			//get servlet specific init params
			String url=config.getInitParameter("db_url");
			String userName=config.getInitParameter("user_name");
			String pwd=config.getInitParameter("password");
			// create dao instances
			userDao = new UserDaoImpl(url, userName, pwd);
			candidateDao = new CandidateDaoImpl(url, userName, pwd);
		} catch (Exception e) {
			// re throw the exc to the caller (WC) , so that WC DOES NOT continue with the
			// rest of the servlet life cycle
			// ServletException(String errMesg,Throwable rootCaus)
			throw new ServletException("err in init of " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			// clean up daos
			userDao.cleanUp();
			candidateDao.cleanUp();
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
			else {// =>success
					// 1.get HttpSession from WC
				HttpSession hs = request.getSession();
				System.out.println("is new ?" + hs.isNew());// t
				System.out.println("session id " + hs.getId());// WC generated long string
				// store validated user dtls n dao instances under session scope
				hs.setAttribute("user_details", user);
				hs.setAttribute("user_dao", userDao);
				hs.setAttribute("candidate_dao", candidateDao);
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
					// WC clears(i.e empties or discards) the resp buffer
					// sends temp redirect resp : SC 302 | location=candidate_list
					// ,WC creates a cookie
					// Set-Cookie : JSESSIONID : sfhfg765476ghfjghjgh | body : EMPTY
					// web browser : chks privacy settings --cookies blocked =>session tracking
					// fails
					// chks age(expiry) : -1 => stores the cookie in cache
					// sends NEXT request : http://host:port/day3.1/candidate_list,
					// method =GET + rq header : cookie :JSESSIONID : sfhfg765476ghfjghjgh
					// --WC --public service(rq,rs) -->protected service --> doGet

				}

			}

		} // pw.flush --> pw.close --resp is committed(rendered/sent)
		catch (Exception e) {
			// re throw the exc to the WC , to inform about the err
			throw new ServletException("err in do-get " + getClass(), e);
		}
	}

}
