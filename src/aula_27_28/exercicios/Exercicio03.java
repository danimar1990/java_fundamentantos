package aula_27_28.exercicios;

public class Exercicio03 {
	public String getEnunciado() {
		String enunciado = "Em todas as questões abaixo, use a classe Math do Java para calcular e imprimir:\n"
				+ "1) dois elevado à décima potência;\n" + "2) raiz quadrada de 1000;\n"
				+ "3) valor absoluto (sem sinal) de -10;\n" + "4) calcular o valor máximo entre os números 42 e 666;\n"
				+ "5) calcular o valor mínimo entre os números 42 e 666;\n"
				+ "6) arredondar o número 4,9 para cima (método ceil);\n"
				+ "7) arredondar o número 4,9 para baixo (método floor);\n"
				+ "8) calcular o seno e cosseno de 90° e a tangente de 45°:\n"
				+ "  8.1) dado que o seno de 90 graus é 1, o cosseno é 0 e a tangente de 45 graus é 1:\n"
				+ "  8.2) converta o número de graus para radianos com o método toRadians()\n"
				+ "  8.3) use o valor em radianos para calcular o seno, cosseno e tangente\n"
				+ "  8.4) finalmente, arredonde o resultado com o método round()";
		return enunciado;
	}

	public void getPotencia() {
		double potencia = Math.pow(2, 10);
		System.out.println("1) " + potencia);
	}

	public void getRaizQuadrada() {
		double raizQuadrada = Math.sqrt(1000);
		System.out.println("2) " + raizQuadrada);
	}

	public void getValorAbsoluto() {
		int valorAbsoluto = Math.abs(-10);
		System.out.println("3) " + valorAbsoluto);
	}

	public void getMaiorNumero() {
		int valorMaximo = Math.max(42, 666);
		System.out.println("4) " + valorMaximo);
	}

	public void getMenorNumero() {
		int valorMinimo = Math.min(42, 666);
		System.out.println("5) " + valorMinimo);
	}

	public void arredondarNumeroParaCima() {
		double numero = Math.ceil(4.9);
		System.out.println("6) " + numero);
	}

	public void arredondarNumeroParaBaixo() {
		double numero = Math.floor(4.9);
		System.out.println("7) " + numero);
	}

	public void getSeno() {
		double seno = Math.round(Math.sin(Math.toRadians(90)));
		System.out.println("8.1) " + seno);
	}

	public void getCosseno() {
		double cosseno = Math.round(Math.cos(Math.toRadians(90)));
		System.out.println("8.2) " + cosseno);
	}

	public void getTangente() {
		double tangente = Math.round(Math.tan(Math.toRadians(45)));
		System.out.println("8.3) " + tangente);
	}

}
