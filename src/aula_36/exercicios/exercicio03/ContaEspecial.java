package aula_36.exercicios.exercicio03;

public final class ContaEspecial extends ContaCorrente {

	private float limite;

	public ContaEspecial(float saldo, float limite) {
		super.saldo = saldo;
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	@Override
	public void sacar(float valor)
			throws SaldoInsuficienteContaCorrenteException, SaldoInsuficienteContaEspecialException {
		if ((super.saldo + this.limite) > valor) {
			super.saldo = super.saldo - valor;
		} else {
			throw new SaldoInsuficienteContaEspecialException("Saldo maior que o valor do limite para sacar R$", valor);
		}
	}

}
