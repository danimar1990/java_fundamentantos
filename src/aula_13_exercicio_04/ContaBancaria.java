package aula_13_exercicio_04;

public class ContaBancaria {
	private String cliente;
	private int numConta;
	private Double saldo;

	public void depositar(Double valor) {
		this.saldo += valor;
	}

	public void sacar(Double valor) {
		this.saldo -= valor;
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
