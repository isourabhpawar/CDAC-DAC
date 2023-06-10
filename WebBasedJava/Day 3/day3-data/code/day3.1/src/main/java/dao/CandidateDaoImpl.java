package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import pojos.Candidate;
import static utils.DBUtils.*;

public class CandidateDaoImpl implements CandidateDao {
	private Connection cn;
	private PreparedStatement pst1,pst2;

	// def ctor
	public CandidateDaoImpl() throws SQLException {
		// open cn , pst1
		cn = openConnection();
		pst1 = cn.prepareStatement("select * from candidates");
		pst2=cn.prepareStatement("update candidates set votes=votes+1 where id=?");
		System.out.println("candidate dao created");

	}

	@Override
	public List<Candidate> getAllCandidates() throws SQLException {
		// create empty AL
		List<Candidate> candidates = new ArrayList<>();
		// exec query
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				candidates.add(new Candidate(rst.getInt(1), rst.getString(2), 
						rst.getString(3), rst.getInt(4)));
		}
		return candidates;
	}
	

	@Override
	public String incrementCandidateVotes(int candidateId) throws SQLException {
		// set IN param : candidate id
		pst2.setInt(1, candidateId);
		int updateCount=pst2.executeUpdate();
		if(updateCount==1)
			return "Updated vote counts...";
		return "Updation of votes failed!!!!!";
		
	}

	// clean up
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		closeConnection();
		System.out.println("candidate dao cleaned up....");
	}

}
