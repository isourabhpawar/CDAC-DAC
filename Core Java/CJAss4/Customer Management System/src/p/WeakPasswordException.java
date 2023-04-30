package p;

@SuppressWarnings("serial")
public class WeakPasswordException extends Exception {
	
	
	
	
	
	public WeakPasswordException(String errmsg) {
		super(errmsg);
		
	}

	public static String chkpass(String pass) throws WeakPasswordException {
		int countU=0,countL=0,countN=0,countSC=0;
		
		for(int i=0;i<pass.length();i++) {
			char c=pass.charAt(i);
			if((int)c>=65 && (int)c<91) {
				countU++;
			}
			if((int)c>96 && (int)c<123) {
				countL++;
			}
			if((int)c>47 && (int)c<58) {
				countN++;
			}
			if((int)c==64 || (int)c>32 && (int)c<48) {
				countSC++;
			}
			
		}
		if(countU==0 || countL==0 || countN==0 || countSC==0) {
			throw new WeakPasswordException("Weak password!!Password should contain atleast"
					+ "one uppercase,lowercase,specialchar(@$%&*.) & number(0-9)");
			
		}
		return pass;
		
		
	}
	
	
	

}
