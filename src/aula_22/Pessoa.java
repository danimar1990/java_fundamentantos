package aula_22;

public abstract class Pessoa {
	String nome;

	void imprimeDados() {
		System.out.println(nome);
	}

	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + "]";
	}

	public Pessoa() {
		super();
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
