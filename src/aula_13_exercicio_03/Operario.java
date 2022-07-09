package aula_13_exercicio_03;

public class Operario extends Empregado {
	private Double valorProducao;
	private Double comissao;

	public Operario(String nome, String telefone, int codigoSetor, Double salarioBase, Double imposto,
			Double valorProducao, Double comissao) {
		super(nome, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	@Override
	public Double calcularSalario() {
		return super.calcularSalario() + ((comissao / 100) * valorProducao);
	}

	public Double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(Double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

}
