package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Student;

/**
 * Servlet implementation class AdmissionResultServlet
 */
@WebServlet("/result")
public class AdmissionResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		// get student details from the curnt request scope
		Student student1 = (Student) request.getAttribute("student_dtls");
		pw.print("<h4>Hello " + student1.getFirstName() + " " + student1.getLastName() + "</h4>");
		if (student1.isAdmitted())
			pw.print("<h5> Congratulaions !!!! , You are admitted in " + student1.getSelectedCourse() + "</h5>");
		else
			pw.print("<h5> Sorry  !!!! , Regret to inform that you can't be  admitted in "
					+ student1.getSelectedCourse() + "</h5>");

	}

}
