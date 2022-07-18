package aula_13.exercicio_01;

import helpers.Helpers;

public class Teste {

	public static void main(String[] args) {
		AssistenteTecnico at = new AssistenteTecnico("Danimar", 6550, 330230, 1000);
		AssistenteAdministrativo aa = new AssistenteAdministrativo("Jaqueline", 8500, 297754, 1250);

		Helpers.divisorMaior();
		at.exibeDados();
		Helpers.divisorMaior();
		aa.exibeDados();
		Helpers.divisorMaior();
	}

}
