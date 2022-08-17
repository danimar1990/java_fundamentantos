package aula_31.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		try {
			int[] numeros = new int[2];

			System.out.println("Digite o 1º número inteiro:");
			numeros[0] = ler.nextInt();

			System.out.println("Digite o 2º número inteiro:");
			numeros[1] = ler.nextInt();
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero!");
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada do usuário.\nSomente são aceitos números inteiros!");
		} catch (RuntimeException e) {
			System.out.println("Erro de runtime identificado!");
		} catch (Exception e) {
			System.out.println("Erro capturado!");
			System.out.println(e.getMessage());
		} finally {
			ler.close();
		}
	}
}
