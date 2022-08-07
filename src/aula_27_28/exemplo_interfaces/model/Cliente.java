package aula_27_28.exemplo_interfaces.model;

public class Cliente extends Pessoa {
	protected double salario;

	public Cliente(String nome, String telefone, String cpf, double salario) {
		super(nome, telefone, cpf);
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCliente [salario=" + salario + "]";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
