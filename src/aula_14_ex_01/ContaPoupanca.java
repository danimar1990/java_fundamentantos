package aula_14_ex_01;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;

	public ContaPoupanca(String cliente, int numConta, Double saldo, int diaRendimento) {
		super();
		this.setCliente(cliente);
		this.setNumConta(numConta);
		this.setSaldo(saldo);
		this.diaRendimento = diaRendimento;
	}

	public Double calcularNovoSaldo() {
		return (this.getSaldo() + (this.getSaldo() * this.diaRendimento) / 100);
	}

	@Override
	public void sacar(Double valor, Double limite) {
		if (this.getSaldo() - valor < 0) {
			System.err.println("Saldo insuficiente!");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque: R$" + valor);
		}
	}

	@Override
	public String toString() {
		return "Cliente: " + this.getCliente() + "\nNúmero da conta: " + this.getNumConta() + "\nSaldo: R$"
				+ this.getSaldo() + "\nRendimento: " + this.getDiaRendimento() + "%";
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

}
