package aula_15.exercicio_02;

public class Circulo implements FormaGeometrica {
	private double raio;

	@Override
	public double calcularArea() {
		return raio * 3.14;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
