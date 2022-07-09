package heranca;

public class JogoCartas extends Jogo {
	private int tamanhoCartas;
	private int quantCartas;

	public void comprarCarta() {
	}

	public void descartarCarta() {
	}

	public void jogarCarta() {
	}
	
	public void infoJogoCarta() {
		super.infoJogo();
		System.out.println("Tamanho da carta: " + this.getTamanhoCartas());
		System.out.println("Quantidade de cartas: " + this.getQuantCartas());
	}

	public int getTamanhoCartas() {
		return tamanhoCartas;
	}

	public void setTamanhoCartas(int tamanhoCartas) {
		this.tamanhoCartas = tamanhoCartas;
	}

	public int getQuantCartas() {
		return quantCartas;
	}

	public void setQuantCartas(int quantCartas) {
		this.quantCartas = quantCartas;
	}

}
