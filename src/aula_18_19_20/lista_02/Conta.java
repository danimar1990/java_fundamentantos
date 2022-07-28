package aula_18_19_20.lista_02;

public class Conta {

	String numeroConta;
	String tipoConta;
	String titularConta;
	double saldo = 0;

	public Conta(String numeroConta, String tipoConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
	}

	String depositar(double deposito) {
		this.saldo += deposito;
		return "Depósito no valor de R$ " + deposito + " realizado com sucesso!";
	}

	String sacar(double saque) {
		if (saque > this.saldo) {
			return ("O valor do saque não pode exceder o valor total da conta. \nSeu saldo atual é de: R$ "
					+ this.saldo);
		} else {
			this.saldo -= saque;
			return "Depósito no valor de R$ " + saque + " realizado com sucesso!";
		}
	}

	String verificarSaldo() {
		return "Titular: " + titularConta + "\nTipo conta: " + tipoConta + "\nNúmero: " + numeroConta + "\n"
				+ "Saldo: R$ " + this.saldo;
	}

}
