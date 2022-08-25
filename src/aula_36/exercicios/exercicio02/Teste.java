package aula_36.exercicios.exercicio02;

public class Teste {

	public static void main(String[] args) {

		try {
			System.out.println(Calculadora.dividir(10, 0));
		} catch (ErroDivisaoPorZeroException e) {
			e.printStackTrace();
		}

	}

}
