package aula_36.exercicios.exercicio01;

public class Calculadora {

	public static int dividir(int num1, int num2) throws ArithmeticException {

		int resultado = 0;

		try {
			if (num2 == 0) {
				throw new ArithmeticException("Erro de divisão por zero!");
			}

			return resultado = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Erro de aritmética: " + e.getMessage());
		}

		return resultado;
	}

}
