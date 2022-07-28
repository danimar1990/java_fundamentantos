package aula_18_19_20.lista_01;

public class Exercicio03 {

	public double gastoFumando(double cigarosCarteira, double cigarosDia, double tempoFumando, double valorCarteira) {
		double total;
		total = Math.round((cigarosDia / cigarosCarteira) * valorCarteira * tempoFumando * 365 * 100.0) / 100.0;
		return total;
	}

}
