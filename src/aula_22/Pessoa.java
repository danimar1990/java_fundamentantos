package aula_22;

public abstract class Pessoa {
	private String nome;

	public abstract void imprimeDados();

	public String getNome() {
		return nome;
	}

	public void setNome(String none) {
		this.nome = none;
	}

}