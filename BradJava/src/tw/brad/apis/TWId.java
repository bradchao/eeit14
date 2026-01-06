package tw.brad.apis;

public class TWId {
	private String id;
	
	public static boolean isRight(String id) {
		boolean isRight = false;
		
//		if (id.length() == 10) {
//			char c1 = id.charAt(0);
//			String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//			if (letters.indexOf(c1) != -1) {
//				char c2 = id.charAt(1);
//				if (c1 == '1' || c2 == '2') {
//					
//				}
//			}
//		}

		if (id.matches("[A-Z][12][0-9]{8}")) {
			
		}
		
		
		return isRight;
	}
	
	
}
