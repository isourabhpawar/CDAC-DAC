package pojos;

public enum Course {
	DAC(85), DBDA(80), DITISS(78), DAI(88);

	private int minScore;

	private Course(int minScore) {
		this.minScore = minScore;
	}

	public int getMinScore() {
		return minScore;
	}

}
