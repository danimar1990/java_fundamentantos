package aula_15.exercicio_02;

public class Quadrado implements FormaGeometrica {
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {

		return lado * lado;
	}

}
