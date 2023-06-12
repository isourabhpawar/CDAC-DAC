package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidateDaoImpl;
import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5>In logout page ....</h5>");
			// voter greeting
			// voter dtls : HttpSession
			// 1. get session from WC
			HttpSession session = request.getSession();
			// get voter_details
			User voter = (User) session.getAttribute("user_details");
			if (voter != null) {
				// find out if voter has voted
				if (voter.isVotingStatus())// voted alrdy
					pw.print("<h5> You have already voted !!!!!</h5>");
				else {// casted a vote just now !
					//http://localhost:8080/day3.1/logout?cid=6
					//get candidate id from req param
					int candidateId=Integer.parseInt(request.getParameter("cid"));
						// get daos from session
					UserDaoImpl userDao = (UserDaoImpl) session.getAttribute("user_dao");
					CandidateDaoImpl canDao = (CandidateDaoImpl) session.getAttribute("candidate_dao");
					//update voting status
					pw.print("<h5>"+userDao.updateVotingStatus(voter.getId())+"</h5>");
					//incr candidate votes
					pw.print("<h5>"+canDao.incrementCandidateVotes(candidateId)+"</h5>");
				}
			} else
				pw.print("<h5>No session Tracking !!!!</h5>");
			//invalidate session
			session.invalidate();
			pw.print("<h5> You have been logged out.....</h5>");
			
		} catch (Exception e) {
			throw new ServletException("err in do-get :"+getClass(), e);
		}
	}

}
