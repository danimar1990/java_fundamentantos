package helpers;

public class Helpers {

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
