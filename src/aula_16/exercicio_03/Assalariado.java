package aula_16.exercicio_03;

public class Assalariado extends Empregado {
	private double salario;

	public Assalariado(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		this.salario = salario;
	}

	@Override
	public double vencimento() {
		return salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
