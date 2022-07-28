package aula_18_19_20.lista_01;

public class Exercicio08 {

	public String potencia(int x, int y) {
		int contador;
		int pot = 1;
		for (contador = 1; contador <= y; contador++) {
			pot = pot * x;
		}
		return ("A potência de " + x + " na " + y + " é " + pot);

	}

}
