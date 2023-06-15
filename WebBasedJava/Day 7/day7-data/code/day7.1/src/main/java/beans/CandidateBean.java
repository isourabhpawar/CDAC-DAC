package beans;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

import dao.CandidateDaoImpl;
import pojos.Candidate;

public class CandidateBean {
	private CandidateDaoImpl candidateDao;
	public CandidateBean() throws SQLException{
		// create dao instance
		candidateDao=new CandidateDaoImpl();
		System.out.println("candidate bean created !");
	}
	public CandidateDaoImpl getCandidateDao() {
		return candidateDao;
	}
	public void setCandidateDao(CandidateDaoImpl candidateDao) {
		this.candidateDao = candidateDao;
	}
	//add B.L method to get top 2 candidates
	public List<Candidate> getTopCandidates() throws SQLException
	{
		return candidateDao.getTop2Candidates();
	}
	
	//add B.L method to get partiwise votes
	public LinkedHashMap<String, Integer> fetchPartyVotes() throws SQLException
	{
		return candidateDao.getPartywiseVotes();
	}
	
}
