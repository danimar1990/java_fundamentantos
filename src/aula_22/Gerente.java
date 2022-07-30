package aula_22;

public class Gerente extends Funcionario {
	private String area;

	public double calcularsalario() {
		super.setSalario(super.getSalario() + (5 / 100));
		return super.getSalario();
	}

	void imprimeDados() {
		System.out.println(area);

	}

	public String getArea() {
		return area;
	}

	public Gerente() {
		super();
	}

	public Gerente(String area) {
		super();
		this.area = area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Gerente [Área: " + area + ", getSalario()=" + getSalario() + "]";
	}

}
