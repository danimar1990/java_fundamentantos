package aula_11.heranca;

import helpers.Helpers;

public class Teste {

	public static void main(String[] args) {
		JogoTabuleiro tabuleiro = new JogoTabuleiro();
		JogoCartas carta = new JogoCartas();
		JogoDados dado = new JogoDados();
		JogoFinal jf = new JogoFinal();

		tabuleiro.setNome("Catan");
		tabuleiro.setDistribuidora("Devir");
		tabuleiro.setNrJogadores(4);
		tabuleiro.setFaixaEtaria(10);
		tabuleiro.setTamanhoTabuleiro("40x40");
		tabuleiro.setQuantPecas(60);

		// M�TODOS DA SUPERCLASSE
		tabuleiro.infoJogoTabuleiro();
		tabuleiro.jogar();

		// M�TODOS DA SUBCLASSE
		tabuleiro.setupTabuleiro();
		tabuleiro.moverPeca();

		Helpers.divisorMaior();
		
		carta.setNome("Taco Gato");
		carta.setDistribuidora("Paper Games");
		carta.setNrJogadores(8);
		carta.setFaixaEtaria(6);
		carta.setTamanhoCartas("Padrão");
		carta.setQuantCartas(60);
		carta.infoJogoCartas();
		carta.comprarCarta();
		carta.descartarCarta();
		carta.jogarCarta();

		Helpers.divisorMaior();

		dado.setNome("Bang Dice Game");
		dado.setDistribuidora("Galápagos Jogos");
		dado.setNrJogadores(8);
		dado.setFaixaEtaria(12);
		dado.setTipoDado("d6");
		dado.setQuantDados(6);
		dado.infoJogoDados();
		dado.arremessarDado();

		Helpers.divisorMaior();

		jf.show();
	}

}
