package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Candidate;

public interface CandidateDao {
//add a method to get list of all candidates
	List<Candidate> getAllCandidates() throws SQLException;
	//add a method to increment chosen candidate votes
	String incrementCandidateVotes(int candidateId) throws SQLException;
}
