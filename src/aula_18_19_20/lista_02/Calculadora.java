package aula_18_19_20.lista_02;

public class Calculadora {

	public Calculadora() {
	}

	public String somar(double n1, double n2) {
		double resposta = n1 + n2;
		return (n1 + " + " + n2 + " = " + resposta);
	}

	public String subtrair(double n1, double n2) {
		double resposta = n1 - n2;
		return (n1 + " - " + n2 + " = " + resposta);
	}

	public String multiplicar(double n1, double n2) {
		double resposta = n1 * n2;
		return (n1 + " * " + n2 + " = " + resposta);
	}

	public String dividir(double n1, double n2) {
		double resposta = n1 / n2;
		return (n1 + " / " + n2 + " = " + resposta);
	}

}
