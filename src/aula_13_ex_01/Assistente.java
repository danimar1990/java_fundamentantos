package aula_13_ex_01;

public class Assistente extends Funcionario {
	private int matricula;

	public Assistente(String nome, double salario, int matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}

	@Override
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Matrícula: " + matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
