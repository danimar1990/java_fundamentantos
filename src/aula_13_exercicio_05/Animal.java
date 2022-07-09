package aula_13_exercicio_05;

public class Animal {
	private String nome;
	private Double comprimento;
	private int nroPatas;
	private String cor;
	private String ambiente;
	private Double velocidade;

	public Animal(String nome, Double comprimento, int nroPatas, String cor, String ambiente, Double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.nroPatas = nroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public void alteraNome(String nome) {
	}

	public void alteraComprimento(int comprimento) {
	}

	public void alteraPatas(int patas) {
	}

	public void alteraCor(String cor) {
	}

	public void alteraAmbiente(String ambiente) {
	}

	public void alteraVelocidade(Double velocidade) {
	}

	public void dadosAnimal() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNroPatas() {
		return nroPatas;
	}

	public void setNroPatas(int nroPatas) {
		this.nroPatas = nroPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
}
