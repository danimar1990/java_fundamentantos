package aula_22.teste;

public class Funcionario extends Pessoa {
	private float salario;

	@Override
	public void imprimeDados() {
		System.out.println("Nome: " + super.getNome());
		System.out.println("Salário: " + this.salario);

	}

	public float calculaImposto() {
		return (float) 0.03;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}