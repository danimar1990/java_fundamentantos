package aula_36.exercicios.exercicio03;

public class ContaCorrente {

	protected float saldo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(float saldo) {
		super();
		this.saldo = saldo;
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	public void sacar(float valor)
			throws SaldoInsuficienteContaCorrenteException, SaldoInsuficienteContaEspecialException {
		if (this.saldo > valor) {
			this.saldo = this.saldo - valor;
		} else {
			throw new SaldoInsuficienteContaCorrenteException("Você não possui saldo suficiente para sacar R$", valor);
		}
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}

}
