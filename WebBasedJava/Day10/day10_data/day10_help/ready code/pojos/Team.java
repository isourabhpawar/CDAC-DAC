package pojos;

//id , name, abbrevation,owner,max_age,batting_avg,wickets_taken
public class Team {
	private int teamId;
	private String name;
	private String abbrevation;
	private String owner;
	private int maxAge;// max age of the player allowed in this team
	private double battingAvg;
	private int wicketsTaken;

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String name, String abbrevation, String owner, int maxAge, double battingAvg,
			int wicketsTaken) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.abbrevation = abbrevation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
	}
	

	public Team(int teamId, String abbrevation) {
		super();
		this.teamId = teamId;
		this.abbrevation = abbrevation;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + ", abbrevation=" + abbrevation + ", owner=" + owner
				+ ", maxAge=" + maxAge + ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}
	

}
