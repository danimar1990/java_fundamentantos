package aula_36.exercicios.exercicio02;

public class Calculadora {

	public static int dividir(int num1, int num2) throws ErroDivisaoPorZeroException {

		int resultado = 0;

		try {
			if (num2 == 0) {
				throw new ErroDivisaoPorZeroException("Erro de divisão por zero!", resultado);
			}
			return resultado = num1 / num2;
		} catch (ErroDivisaoPorZeroException e) {
			System.out.println("Divisao por 0 erro: " + e.getMessage());
		}

		return resultado;

	}

}
