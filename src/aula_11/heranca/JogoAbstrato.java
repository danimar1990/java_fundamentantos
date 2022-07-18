package aula_11.heranca;

public abstract class JogoAbstrato {
	private String nome;
	private String distribuidora;
	private int nrJogadores;
	private int faixaEtaria;

	// M�TODO ABSTRATO N�O PODE SER IMPLEMENTADO NA CLASSE M�E
	// ELE OBRIGA QUE A CLASSE FILHA IMPLEMENTE O M�TODO
	public abstract void infoJogo();

	// IMPEDE QUE CLASSES FILHAS SOBRESCREVAM O M�TODO
	public final void jogar() {
		System.out.println("Voc� est� jogando");
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