package aula_03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int maior = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o primeiro número:");
		numero1 = scanner.nextInt();
		System.out.println("Entre com o segundo número:");
		numero2 = scanner.nextInt();
		scanner.close();

		if (numero1 > numero2) {
			maior = numero1;
		} else {
			maior = numero2;
		}

		System.out.println("O maior número é " + maior);

	}

}
