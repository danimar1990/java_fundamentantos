package aula_11.heranca;

public class Jogo {
	private String nome;
	private String distribuidora;
	private int nrJogadores;
	private int faixaEtaria;

	public void infoJogo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Distribuidora: " + this.getDistribuidora());
		System.out.println("Número de jogadores: " + this.getNrJogadores());
		System.out.println("Faixa etária: " + this.getFaixaEtaria());
	}

	public void jogar() {
		System.out.println("Você está jogando!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public int getNrJogadores() {
		return nrJogadores;
	}

	public void setNrJogadores(int nrJogadores) {
		this.nrJogadores = nrJogadores;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

}
