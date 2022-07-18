package aula_03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;

		System.out.println("Informe seu nome:");
		nome = scanner.next();
		System.out.println("Informe sua idade:");
		idade = scanner.nextInt();
		scanner.close();

		if (idade >= 18 && idade <= 67) {
			System.out.println(nome + ", você está apto a doar sangue!");
		} else {
			System.out.println(nome + ", você não pode doar sangue!");
		}

	}

}
