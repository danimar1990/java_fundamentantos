package aula_22;

public class Funcionario extends Pessoa {
	private float salario;

	public Funcionario() {
		super();
	}

	public Funcionario(float salario) {
		super();
		this.salario = salario;
	}

	void calculaImposto() {
		float imposto;
		imposto = (3 / 100);
		salario = imposto * salario;

	}

	void imprimeDados() {
		System.out.println("O valor do imposto a ser pago é de R$ " + salario);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [Salário: R$ " + salario + "]";
	}

}
