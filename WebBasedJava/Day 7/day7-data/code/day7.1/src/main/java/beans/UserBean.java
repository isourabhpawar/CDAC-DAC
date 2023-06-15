package beans;

import java.sql.SQLException;

import dao.UserDaoImpl;
import pojos.User;

public class UserBean {
//properties 
	private String email;
	private String password;
	// dep : dao layer
	private UserDaoImpl userDao;
	// result : pojo
	private User userDetails;

	// def ctor
	public UserBean() throws SQLException {
		// dao instance
		userDao = new UserDaoImpl();
		System.out.println("user bean created...");
	}

	// setters n getters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	// Add a B.L method for user authentication + authorization
	public String validateUser() throws SQLException {
		System.out.println("in validate user " + email + " " + password);
		// invoke dao's method
		userDetails = userDao.authenticateUser(email, password);
		if (userDetails != null) {
			// => login success --> continue to role based auth
			if (userDetails.getRole().equals("voter")) {
				if (userDetails.isVotingStatus())
					return "logout";
				// => voter : not yet voted
				return "candidate_list";
			}
			// => admin user
			return "admin";
		}
		// => invalid login
		return "login";

	}
}
