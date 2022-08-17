package aula_32.exercicios.dominio;

public class Usuario {
	private String nome;
	
	public Usuario() {};
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + "]";
	}
	
}
