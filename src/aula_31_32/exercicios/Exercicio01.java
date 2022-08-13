package aula_31_32.exercicios;

public class Exercicio01 {
	public static void main(String[] args) {
		try {
			int[] numeros = {10, 0};
			
			System.out.println(numeros[0] / numeros[2]);
		} catch (Exception e) {
			System.out.println("Erro capturado!\n" + e.getMessage());
		}
	}
}
