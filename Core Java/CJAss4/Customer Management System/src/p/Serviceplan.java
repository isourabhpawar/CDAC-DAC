package p;
public enum Serviceplan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	private int charge;
	
	
	public int getCharge() {
		return charge;
	}


	public void setCharge(int charge) {
		this.charge = charge;
	}


	private Serviceplan(int charge) {
		this.charge=charge;
		
	}
}
