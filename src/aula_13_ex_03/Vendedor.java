package aula_13_ex_03;

public class Vendedor extends Empregado {
	private Double valorVendas;
	private Double comissao;

	public Vendedor(String nome, String telefone, int codigoSetor, Double salarioBase, Double imposto,
			Double valorVendas, Double comissao) {
		super(nome, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	@Override
	public Double calcularSalario() {
		return super.calcularSalario() + ((comissao / 100) * valorVendas);
	}

	public Double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(Double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

}
