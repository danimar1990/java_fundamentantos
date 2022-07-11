package aula_03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int numero;
		int antecessor;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		scanner.close();
		antecessor = numero - 1;
		System.out.println("O antecessor do número " + numero + " é o número " + antecessor);
	}

}
