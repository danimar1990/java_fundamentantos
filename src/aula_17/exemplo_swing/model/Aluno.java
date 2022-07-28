package aula_17.exemplo_swing.model;

public class Aluno {
	private String nome;
	private int idade;
	private char sexo;
	private double media;

	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade, char sexo, double media) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", media=" + media + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
}
