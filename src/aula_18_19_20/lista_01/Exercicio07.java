package aula_18_19_20.lista_01;

public class Exercicio07 {

	public String atv7() {
		double alturaChico = 1.50, alturaZe = 1.10, cresceChico = 0.2, cresceZe = 0.3;
		int anos = 0;
		while (alturaZe < alturaChico) {
			alturaChico += cresceChico;
			alturaZe += cresceZe;
			anos++;
		}
		return ("Serão necessários " + anos + " anos para Ze ser maior que Chico");
	}

}
