package aula_15.polimorfismo;

public class AssinaturaMetodo {
	String texto;
	float numero;
	double salario;
	double aumento;

	public AssinaturaMetodo() {
		super();
	}

	public AssinaturaMetodo(float numero) {
		super();
		this.numero = numero;
	}

	public AssinaturaMetodo(String texto) {
		super();
		this.texto = texto;
	}

	public void calcular() {
		System.out.println("M�todo sem par�metro!");

	}

	public void calcular(double n1, float n2) {
		System.out.println("2 par�metros, 1 double e 1 float");
	}

	public void calcular(float n1) {
		System.out.println("1 par�metro, 1 float");
	}

	public void calcular(float n1, float n2) {
		System.out.println("2 par�metros, 2 float");
	}

	public void calcular(double n1, double n2, String s1, String s2) {
		System.out.println("4 par�metros, 2 double, 2 String");
	}

	public void calcularSalario() {
		System.out.println("Sal�rio permanece o mesmo: " + salario);
	}

	public void calcularSalario(double aumento) {
		salario += aumento;
		System.out.println("Sal�rio teve um aumento: " + salario);
	}
}
