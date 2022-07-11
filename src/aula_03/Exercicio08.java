package aula_03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int x;
		int y;
		int i;
		int potencia = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a base:");
		x = scanner.nextInt();
		System.out.println("Digite o expoente:");
		y = scanner.nextInt();
		scanner.close();

		potencia = x;

		for (i = 1; i < y; i++) {
			potencia *= x;
		}

		System.out.println("No valor de X se elevado a Y será " + potencia);
	}

}
