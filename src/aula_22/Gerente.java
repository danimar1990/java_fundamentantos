package aula_22;

public class Gerente extends Funcionario {
	private String area;

	@Override
	public float calculaImposto() {
		return (float) 0.05;
	}

	@Override
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Área: " + area);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
