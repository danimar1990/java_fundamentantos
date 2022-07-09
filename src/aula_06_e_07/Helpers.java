package aula_06_e_07;

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
	
	public static void divisormaior() {
		System.out.println("----------------------------------------------");
	}

}
