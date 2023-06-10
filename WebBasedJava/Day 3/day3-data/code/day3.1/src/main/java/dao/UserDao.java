package dao;

import java.sql.SQLException;

import pojos.User;

public interface UserDao {
//add a method for user authentication(login)
	User authenticateUser(String email, String password) throws SQLException;
	//add a method to update voting status
	String updateVotingStatus(int voterId) throws SQLException;
}
