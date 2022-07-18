package aula_12.exercicio_02;

import helpers.Helpers;

public class Teste {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaEspecial ce = new ContaEspecial(1000);

		System.out.println("Conta Corrente:");
		cc.depositar(500);
		cc.sacar(100);
		cc.toString();

		Helpers.divisorMaior();

		System.out.println("Conta Especial:");
		ce.depositar(500);
		ce.toString();
	}
}
