package tw.brad.tutor;

public class PokerV3 {

	public static void main(String[] args) {
		final int num = 52;
		int[] poker = new int[num];
		for (int i=0; i<num; i++) poker[i] = i;
		
		for (int i = num - 1; i > 0; i--) {
			int r = (int)(Math.random()*(i+1));
			// poker[i] <=> poker[r]
			int temp = poker[i];
			poker[i] = poker[r];
			poker[r] = temp;
		}
		
		for (int card: poker) {
			System.out.println(card);
		}
		
	}

}
