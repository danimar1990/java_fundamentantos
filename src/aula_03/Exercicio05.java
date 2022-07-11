package aula_03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int idade;
		String nome;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome = scanner.next();
		System.out.println("Digite sua idade:");
		idade = scanner.nextInt();
		scanner.close();

		if (idade < 16) {
			System.out.println(nome + ", você não é de maior, portanto não pode votar!");
		} else {
			System.out.println(nome + ", você está apto a votar!");
		}

	}

}
