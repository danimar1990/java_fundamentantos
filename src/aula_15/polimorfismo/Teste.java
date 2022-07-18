package aula_15.polimorfismo;

import helpers.Helpers;

public class Teste {
	public static void main(String[] args) {
		AssinaturaMetodo am = new AssinaturaMetodo();

		am.calcular();
		am.calcular(10, 20);
		am.calcular(1);
		am.calcular(10.1, 0);
		am.calcular(0, 0, "A", "B");
		Helpers.divisorMaior();

		am.salario = 2000;
		am.calcularSalario();
		am.calcularSalario(500);
	}
}
