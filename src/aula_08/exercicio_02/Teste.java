package aula_08.exercicio_02;

public class Teste {

	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();

		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.diminuirVolume();

		controle.aumentarCanal();
		controle.aumentarCanal();
		controle.aumentarCanal();
		controle.aumentarCanal();
		controle.aumentarCanal();
		controle.diminuirCanal();
		controle.diminuirCanal();
		controle.diminuirCanal();
		controle.aumentarCanal();

		controle.informacoesTv();
	}

}
