package aula_31.exercicios;

public class Exercicio02 {
	public static void main(String[] args) {
		try {
			int[] numeros = { 10, 0 };

			System.out.println(numeros[0] / numeros[2]);
		} catch (RuntimeException e) {
			System.out.println("Erro de runtime identificado!\n" + e.getMessage());
		}
	}
}
