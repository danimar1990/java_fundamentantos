package aula_32.exercicios.conta;

public class ContaCorrente {
	protected float saldo;

	public ContaCorrente() {
	};

	public ContaCorrente(float saldo) {
		this.saldo = saldo;
	};

	public void depositar(float deposito) {
		saldo += deposito;
	}

	public boolean sacar(float saque) {
		if (saldo - saque >= 0) {
			saldo = saldo - saque;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}

}
