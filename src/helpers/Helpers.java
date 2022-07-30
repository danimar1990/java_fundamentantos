package helpers;

import java.text.DecimalFormat;

public class Helpers {

	public DecimalFormat getDecimalFormat() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return df;
	}

	public static void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void divisorMenor() {
		System.out.println("----------------------");
	}

	public static void divisorMaior() {
		System.out.println("----------------------------------------------");
	}

}
