package aula_05;

public class Principal {

	public static void main(String[] args) {
		Joystick js1 = new Joystick("PS4", "Preto", 50);
		Joystick js2 = new Joystick();
		Joystick js3 = new Joystick("XBOX");

		js2.modelo = "PS5";
		js2.cor = "Branco";
		js2.porcentagemBateria = 100;

		js3.cor = "Preto";
		js3.porcentagemBateria = 10;

		js1.visualizarInfoJoystick();
		System.out.println();
		js2.visualizarInfoJoystick();
		System.out.println();
		js3.visualizarInfoJoystick();
	}

}
