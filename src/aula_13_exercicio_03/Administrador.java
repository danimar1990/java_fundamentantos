package aula_13_exercicio_03;

public class Administrador extends Empregado {
	private Double ajudaDeCusto;

	public Administrador(String nome, String telefone, int codigoSetor, double salarioBase, double imposto,
			double ajudaDeCusto) {
		super(nome, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public Double calcularSalario() {
		return super.calcularSalario() + ajudaDeCusto;
	}

	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
