package aula_05;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa("Pedro", 20);
		Pessoa p2 = new Pessoa("Maria", 15);

		p1.exibirInfo();
		p2.exibirInfo();

		sc.close();
	}

}
