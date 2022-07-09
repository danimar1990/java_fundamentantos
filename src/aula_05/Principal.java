package aula_05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Joystick js1 = new Joystick();
		Joystick js2 = new Joystick("Nintendo DS");
		Joystick js3 = new Joystick("XBOX Series Joystick", "Branco", 58);
		
		System.out.println("Informe o modelo do joystick 1:");
		js1.modelo = scanner.nextLine();
		System.out.println("Informe a cor do joystick 1:");
		js1.cor = scanner.nextLine();
		System.out.println("Informe a porcentagem da bateria do joystick 1:");
		js1.porcentagemBateria = scanner.nextInt();
		scanner.close();		
		
		js1.visualizarjoystick();
		js1.conectar();
		js1.recarregar();
		
		js2.visualizarjoystick();
		js2.conectar();
		js2.recarregar();
		
		js3.visualizarjoystick();
	}

}
