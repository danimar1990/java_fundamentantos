package aula_18_19_20.lista_01;

public class Exercicio04 {

	public String numeroMaior(double num1, double num2) {
		if (num1 > num2) {
			return (num1 + " é maior que " + num2);
		} else if (num1 < num2) {
			return (num2 + " é maior que " + num1);
		} else {
			return (num1 + " é igual a " + num2);
		}
	}

}
