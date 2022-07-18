package aula_14.exercicio_01;

public abstract class ContaBancaria {
	private String cliente;
	private int numConta;
	private Double saldo;

	public abstract void sacar(Double valor, Double limite);

	public abstract String toString();

	public void depositar(Double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado: R$ " + valor);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
