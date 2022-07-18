package aula_13.exercicio_03;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private Double salarioBase;
	private Double imposto;

	public Empregado(String nome, String telefone, int codigoSetor, Double salarioBase, Double imposto) {
		super(nome, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public Double calcularSalario() {
		return salarioBase - imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

}
