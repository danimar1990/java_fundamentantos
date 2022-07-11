package aula_12;

public class Empregado {
	private String nome;
	protected float salario;

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + salario + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
