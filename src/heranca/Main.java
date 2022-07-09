package heranca;

public class Main {
	public static void main(String[] args) {
		JogoTabuleiro tabuleiro = new JogoTabuleiro();
		JogoCartas carta = new JogoCartas();
		JogoDados dado = new JogoDados();
		
		tabuleiro.setNome("Catan");
		tabuleiro.setDistribuidora("Devir");
		tabuleiro.setNrJogadores(4);
		tabuleiro.setFaixaEtaria(10);
		tabuleiro.setTamanhoTabuleiro("40x40");
		tabuleiro.setQuantidadePecas(60);
		tabuleiro.infoJogoTabuleiro();
		tabuleiro.jogar();
		tabuleiro.setupTabuleiro();
		tabuleiro.moverPeca();
		System.out.println("---------------------------------");
		carta.setNome("Taco Gato");
		carta.setDistribuidora("Paper Games");
		carta.setNrJogadores(8);
		carta.setFaixaEtaria(6);
		carta.setTamanhoCartas(60);
		carta.comprarCarta();
		carta.jogarCarta();
		carta.infoJogoCarta();
		System.out.println("---------------------------------");
		dado.setNome("Taco Gato");
		dado.setDistribuidora("Paper Games");
		dado.setNrJogadores(8);
		dado.setFaixaEtaria(6);
		dado.setTipoDado("Quadrado");
		dado.setQuantDados(6);
		dado.arremessarDado();
		
	}
}
