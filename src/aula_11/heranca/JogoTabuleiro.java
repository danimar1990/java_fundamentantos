package aula_11.heranca;

public class JogoTabuleiro extends Jogo {
	private String tamanhoTabuleiro;
	private int quantPecas;

	public void setupTabuleiro() {
		System.out.println("Tabuleiro montado!");
	}

	public void moverPeca() {
		System.out.println("Peça movimentada!");
	}

	public void infoJogoTabuleiro() {
		super.infoJogo();
		System.out.println("Tamanho do Tabuleiro: " + this.getTamanhoTabuleiro());
		System.out.println("Quantidade de Peças: " + this.getQuantPecas());
	}

	public String getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}

	public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}

	public int getQuantPecas() {
		return quantPecas;
	}

	public void setQuantPecas(int quantPecas) {
		this.quantPecas = quantPecas;
	}

}
