package aula_15.exercicio_02;

public class Retangulo implements FormaGeometrica {
	private double tamanhoBase;
	private double altura;

	public Retangulo(double tamanhoBase, double altura) {
		super();
		this.tamanhoBase = tamanhoBase;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {

		return tamanhoBase * altura;
	}

	public double getTamanhoBase() {
		return tamanhoBase;
	}

	public void setTamanhoBase(double tamanhoBase) {
		this.tamanhoBase = tamanhoBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
