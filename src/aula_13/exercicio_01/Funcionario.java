package aula_13.exercicio_01;

import java.text.DecimalFormat;

public abstract class Funcionario {
	private String nome;
	private Double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void addAumento(double valor) {
		this.salario += valor;
	}

	public double ganhoAnual() {
		return salario * 12;
	}

	public void exibeDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salário mensal: R$" + new DecimalFormat("#,##0.00").format(this.salario));
		System.out.println("Ganho anual: R$" + new DecimalFormat("#,##0.00").format(this.ganhoAnual()));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
