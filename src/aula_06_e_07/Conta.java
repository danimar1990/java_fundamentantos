package aula_06_e_07;

import java.util.Scanner;

import helpers.Helpers;

public class Conta {
	public String numeroConta;
	public String tipoConta;
	public String titularConta;
	public Double saldo = 0d;
	public Double valorDeposito = 0d;
	public Double valorSaque = 0d;
	public Double limite = 0d;

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(Double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	public Double getValorSaque() {
		return valorDeposito;
	}

	public void setValorSaque(Double valorSaque) {
		this.valorSaque = valorSaque;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	static Scanner sc = new Scanner(System.in);

	public void abrirConta() {
		System.out.print("Informe o seu nome: ");
		titularConta = sc.next();
		System.out.println("Qual tipo de conta deseja abrir?");
		tipoConta = sc.next();
		numeroConta = geraNumeroConta();
		System.out.println("Abertura de conta realizada com sucesso! Aguarde..");
	}

	public String geraNumeroConta() {
		int nroConta = (int) (Math.random() * Math.pow(10, 7));
		numeroConta = String.valueOf(nroConta + "-9");
		return numeroConta;
	}

	public void depositar(double valorDeposito) {
		System.out.print("Informe a quantia que deseja depositar: R$");
		valorDeposito = sc.nextInt();
		saldo += valorDeposito;
		System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!");
	}

	public void sacar(double valorSaque) {
		System.out.print("Informe a quantia que deseja sacar: R$");
		valorSaque = sc.nextInt();
		if (valorSaque > saldo) {
			System.out.println("O valor informado para saque é maior que o saldo total da conta!");
		} else {
			this.saldo -= valorSaque;
			System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
		}
	}

	public Double calcularLimite(Double limite) {
		if (this.getSaldo() < 1000) {
			limite = 0d;
		} else if (this.getSaldo() > 1001 && this.getSaldo() < 2000) {
			limite = ((10.0 / 100.0) * saldo);
		} else if (saldo > 2001 && saldo < 5000) {
			limite =((30.0 / 100.0) * saldo);
		} else {
			limite = ((50.0 / 100.0) * saldo);
		}
		return limite;
	}

	public void consultarDadosBancarios() {
		System.out.println("Olá " + titularConta + ", seja bem vindo(a)!");
		System.out.println("Tipo: " + tipoConta);
		System.out.println("Número: " + numeroConta);
	}

	public void consultarSaldo(Double saldo, Double limite) {
		System.out.println("Seu saldo é de:  R$" + saldo);
		System.out.println("Seu limite é de: R$" + calcularLimite(limite));
		Double saldoTotal =  saldo + calcularLimite(limite);
		System.out.println("Saldo + limite:  R$" + saldoTotal);
	}

	public void menu() {
		int opcao = 0;

		while (opcao != 6) {
			System.out.println("--------------[ CONTA BANCÁRIA ]--------------");
			if (numeroConta == null) {
				System.out.println("1 - Abrir conta");
				System.out.println();
				System.out.println("2 - Finalizar");
				System.out.print("Digite uma opção do menu acima: ");
				opcao = sc.nextInt();
			} else {
				System.out.println("1 - Meus dados");
				System.out.println("2 - Consultar saldo");
				System.out.println("3 - Depositar");
				System.out.println("4 - Sacar");
				System.out.println();
				System.out.println("5 - Finalizar");
				Helpers.divisormaior();
				System.out.print("Digite uma opção do menu acima: ");
				opcao = sc.nextInt();
			}

			if (numeroConta == null) {
				switch (opcao) {
				case 1:
					abrirConta();
					Helpers.sleep();
					break;
				case 2:
					System.out.println("Finalizando sessão!");
					System.out.println("Voltando ao menu principal..");
					Principal.menu();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			} else {
				switch (opcao) {
				case 1:
					consultarDadosBancarios();
					Helpers.sleep();
					break;
				case 2:
					consultarSaldo(saldo, limite);
					Helpers.sleep();
					break;
				case 3:
					depositar(valorDeposito);
					Helpers.sleep();
					break;
				case 4:
					sacar(valorSaque);
					Helpers.sleep();
					break;
				case 5:
					System.out.println("Finalizando sessão!");
					System.out.println("Voltando ao menu principal..");
					Principal.menu();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}
			}
		}
		sc.close();
	}
}
