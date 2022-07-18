package aula_15.exercicio_02;

import java.util.Scanner;

import helpers.Helpers;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;
		double tamanhoBase, altura;

		System.out.println("Escolha a forma que deseja calcular:");
		System.out.println("1 - Quadrado\n2 - Retângulo\n3 - Círculo");
		Helpers.divisorMenor();
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("Digite o tamanho do lado: ");
			Quadrado q = new Quadrado(sc.nextDouble());
			System.out.println(q.calcularArea());
			break;
		case 2:
			System.out.print("Digite o tamanho da base: ");
			tamanhoBase = sc.nextDouble();
			System.out.println("Digite a altura");
			altura = sc.nextDouble();
			Retangulo r = new Retangulo(tamanhoBase, altura);
			System.out.println(r.calcularArea());
			break;
		case 3:
			System.out.print("Digite o tamanho do raio: ");
			Circulo c = new Circulo(sc.nextDouble());
			System.out.println(c.calcularArea());
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		sc.close();
	}

}
