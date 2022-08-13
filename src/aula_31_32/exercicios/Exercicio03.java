package aula_31_32.exercicios;

public class Exercicio03 {
	public static void main(String[] args) {
		try {
			int[] numeros = { 10, 0 };

			System.out.println(numeros[0] / numeros[1]);
		} catch (ArithmeticException e) {
			System.out.println("Erro de aritmética!\n" + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro de runtime identificado!\n" + e.getMessage());
		}
	}
}
