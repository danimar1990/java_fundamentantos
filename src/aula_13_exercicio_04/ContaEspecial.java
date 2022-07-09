package aula_13_exercicio_04;

public class ContaEspecial extends ContaBancaria {
	private Double limite;

	public ContaEspecial(Double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(Double valor) {
		super.sacar(valor);
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
}
