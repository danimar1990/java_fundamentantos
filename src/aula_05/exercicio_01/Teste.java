package aula_05.exercicio_01;

import java.util.Scanner;

import helpers.Helpers;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa("Pedro", 20);
		Pessoa p2 = new Pessoa("Maria", 15);

		p1.exibirInfo();
		Helpers.divisorMenor();
		p2.exibirInfo();

		sc.close();
	}

}
