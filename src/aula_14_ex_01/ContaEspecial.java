package aula_14_ex_01;

public class ContaEspecial extends ContaBancaria {
	private Double limite;

	public ContaEspecial(String cliente, int numConta, Double saldo, Double limite) {
		super();
		this.setCliente(cliente);
		this.setNumConta(numConta);
		this.setSaldo(saldo);
		this.limite = limite;
	}

	@Override
	public void sacar(Double limite, Double valor) {
		if (this.getSaldo() < limite) {
			System.err.println("O valor do saque é maior que o limite da conta.");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque: R$" + valor);
		}

	}

	@Override
	public String toString() {
		return "Cliente: " + this.getCliente() + "\nNúmero da conta: " + this.getNumConta() + "\nSaldo: R$"
				+ this.getSaldo() + "\nLimite: R$" + this.getLimite();
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
}
