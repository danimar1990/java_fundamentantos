package heranca;

public class JogoTabuleiro extends Jogo {
	private String tamanhoTabuleiro;
	private int quantidadePecas;
	
	public void setupTabuleiro() {
		System.out.println("Tabuleiro montado!");
	}
	
	public void moverPeca() {
		System.out.println("Peça movida!");
	}
	
	public void infoJogoTabuleiro() {
		super.infoJogo();
		System.out.println("Tamanho do tabuleiro: " + this.getTamanhoTabuleiro());
		System.out.println("Quantidade de peças: " + this.getQuantidadePecas());
	}

	public String getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}

	public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}

	public int getQuantidadePecas() {
		return quantidadePecas;
	}

	public void setQuantidadePecas(int quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}

}
