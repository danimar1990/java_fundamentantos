package aula_12.exercicio_02;

public class ContaCorrente {
	protected float saldo;

	public ContaCorrente() {
	}

	public ContaCorrente(float saldo) {
		super();
		this.saldo = saldo;
	}

	public void depositar(float valor) {
		saldo += valor;
		System.out.println("Valor depositado: " + valor);
	}

	public void sacar(float valor) {
		saldo -= valor;
		System.out.println("Valor sacado: " + valor);
	}

	@Override
	public String toString() {
		return "---[ContaCorrente]---\nSaldo: " + this.getSaldo();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
