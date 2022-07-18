package aula_16.exercicio_02;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empresa empresa = new Empresa(null, 0, 0) {

			@Override
			public void getGrauEscolaridade(int escolaridade) {
			}

		};

		System.out.print("Digite sua escolaridade: ");
		sc.nextInt(empresa.getEscolaridade());

		System.out.println(empresa.getEscolaridade());
		sc.close();
	}
}
