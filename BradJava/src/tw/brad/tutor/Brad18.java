package tw.brad.tutor;

import tw.brad.apis.Scooter;

public class Brad18 {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		s1.upSpeed();s1.upSpeed();s1.upSpeed();
		s1.upSpeed(); s1.downSpeed();
		System.out.println(s1.getSpeed());
	}

}
