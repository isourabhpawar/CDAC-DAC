package beans;

import java.sql.SQLException;
import java.util.List;

import dao.TeamDaoImpl;
import pojos.Team;

public class IPLBean {
//state : dep : dao
	private TeamDaoImpl teamDao;
	public IPLBean() throws SQLException{
		//dao instace
		teamDao=new TeamDaoImpl();
		System.out.println("IPL bean created...");
		
	}
	//getters n setters
	public TeamDaoImpl getTeamDao() {
		return teamDao;
	}
	public void setTeamDao(TeamDaoImpl teamDao) {
		this.teamDao = teamDao;
	}
	//add B.L method to ret list of all teams to the caller(JSP)
	public List<Team> fetchAllTeams() throws SQLException
	{
		//invoke dao's method
		return teamDao.getSelectedDetails();
	}
	
	
}
