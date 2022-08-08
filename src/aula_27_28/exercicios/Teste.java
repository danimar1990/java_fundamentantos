package aula_27_28.exercicios;

import java.util.Scanner;

import helpers.Helpers;

public class Teste {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		menu();
		sc.close();
	}

	public static void menu() {
		int opcao = 0;

		while (opcao != 666) {
			System.out.println("-------------[ MENU DO SISTEMA ]--------------");

			for (int i = 1; i < 12; i++) {
				System.out.println(i + " - Exercício " + i);
			}
			System.out.println();
			System.out.println("666 - Finalizar programa");
			Helpers.divisorMaior();
			System.out.print("Digite uma opção do menu acima: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				exercicio01();
				Helpers.sleep();
				break;

			case 2:
				exercicio02();
				Helpers.sleep();
				break;

			case 3:
				exercicio03();
				Helpers.sleep();
				break;

			case 4:
				exercicio04();
				Helpers.sleep();
				break;

			case 5:
				exercicio05();
				Helpers.sleep();
				break;

			case 6:
				exercicio06();
				Helpers.sleep();
				break;

			case 7:
				exercicio07();
				Helpers.sleep();
				break;

			case 8:
				exercicio08();
				Helpers.sleep();
				break;
			case 9:
				exercicio09();
				Helpers.sleep();
				break;

			case 10:
				exercicio10();
				Helpers.sleep();
				break;

			case 11:
				exercicio11();
				Helpers.sleep();
				break;

			case 0:
				System.out.println("Adeus, meu jovem!");
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

	public static void exercicio01() {
		Exercicio01 exercicio01 = new Exercicio01();
		System.out.println("----------------[Exercício 01]----------------");
		System.out.println(exercicio01.getEnunciado());
		Helpers.divisorMenor();
		System.out.println("Número INT convertido em BYTE: " + exercicio01.getNumero1Convertido());
		System.out.println("Número DOUBLE convertido em FLOAT: " + exercicio01.getNumero2Convertido());
	}

	public static void exercicio02() {
		Exercicio02 exercicio02 = new Exercicio02();
		System.out.println("----------------[Exercício 02]----------------");
		System.out.println(exercicio02.getEnunciado());
		Helpers.divisorMenor();
		System.out.println(exercicio02.getCorrecao());
	}

	public static void exercicio03() {
		Exercicio03 exercicio03 = new Exercicio03();
		System.out.println("----------------[Exercício 03]----------------");
		System.out.println(exercicio03.getEnunciado());
		Helpers.divisorMenor();
		exercicio03.getPotencia();
		exercicio03.getRaizQuadrada();
		exercicio03.getValorAbsoluto();
		exercicio03.getMaiorNumero();
		exercicio03.getMenorNumero();
		exercicio03.arredondarNumeroParaCima();
		exercicio03.arredondarNumeroParaBaixo();
		exercicio03.getSeno();
		exercicio03.getCosseno();
		exercicio03.getTangente();
	}

	public static void exercicio04() {
		Exercicio04 exercicio04 = new Exercicio04();
		System.out.println("----------------[Exercício 04]----------------");
		System.out.println(exercicio04.getEnunciado());
		Helpers.divisorMenor();
		System.out.print("Digite seu peso (ex: 74,5): ");
		double peso = sc.nextDouble();
		System.out.print("Digite sua altura (ex: 1,81): ");
		double altura = sc.nextDouble();
		Helpers.divisorMenor();
		exercicio04.getIndiceMassaCorporal(peso, altura);
	}

	private static void exercicio05() {
		Exercicio05 exercicio05 = new Exercicio05();
		System.out.println("----------------[Exercício 05]----------------");
		System.out.println(exercicio05.getEnunciado());
		Helpers.divisorMenor();
		exercicio05.getCircunferencia();
	}

	public static void exercicio06() {
		Exercicio06 exercicio06 = new Exercicio06();
		System.out.println("----------------[Exercício 06]----------------");
		System.out.println(exercicio06.getEnunciado());
		Helpers.divisorMenor();
		exercicio06.teste();
	}

	public static void exercicio07() {
		Exercicio07 exercicio07 = new Exercicio07();
		System.out.println("----------------[Exercício 07]----------------");
		System.out.println(exercicio07.getEnunciado());
		Helpers.divisorMenor();
		exercicio07.getConstantes();
	}

	public static void exercicio08() {
		Exercicio08 exercicio08 = new Exercicio08();
		System.out.println("----------------[Exercício 08]----------------");
		System.out.println(exercicio08.getEnunciado());
		Helpers.divisorMenor();
		exercicio08.teste();
	}

	public static void exercicio09() {
		Exercicio09 exercicio09 = new Exercicio09();
		System.out.println("----------------[Exercício 09]----------------");
		System.out.println(exercicio09.getEnunciado());
		Helpers.divisorMenor();
		exercicio09.teste();
	}

	public static void exercicio10() {
		Exercicio10 exercicio10 = new Exercicio10();
		System.out.println("----------------[Exercício 10]----------------");
		System.out.println(exercicio10.getEnunciado());
		Helpers.divisorMenor();
		exercicio10.teste();
	}

	public static void exercicio11() {
		Exercicio11 exercicio11 = new Exercicio11();
		System.out.println("----------------[Exercício 11]----------------");
		Helpers.divisorMenor();
	}

}
