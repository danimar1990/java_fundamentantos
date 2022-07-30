package aula_06_07;

public class Calculadora {
	public double n1;
	public double n2;

	public Calculadora() {
	}

	public Calculadora(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public void somar(double n1, double n2) {
		System.out.println("Método somar()");
		double soma = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + soma);
	}

	public void subtrair(double n1, double n2) {
		System.out.println("Método subtrair()");
		double subtracao = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + subtracao);
	}

	public void multiplicar(double n1, double n2) {
		System.out.println("Método multiplicar()");
		double multiplicacao = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
	}

	public void dividir(double n1, double n2) {
		System.out.println("Método dividir()");
		double divisao = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + divisao);
	}

}
