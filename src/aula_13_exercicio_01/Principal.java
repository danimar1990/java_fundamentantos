package aula_13_exercicio_01;

public class Principal {

	public static void main(String[] args) {
		AssistenteTecnico at = new AssistenteTecnico("Danimar", 6550, 330230, 1000);
		AssistenteAdministrativo aa = new AssistenteAdministrativo("Jaqueline", 8500, 297754, 1250);

		Helpers.divisormaior();
		at.exibeDados();
		Helpers.divisormaior();
		aa.exibeDados();
		Helpers.divisormaior();
	}

}
