package aula_08.exercicio_01;

import helpers.Helpers;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		String retorno;

		System.out.println("Utilizando Setters:");
		pessoa.setNome("Pedro");
		pessoa.setAnoNasc(2000);
		pessoa.setAltura(1.75);

		pessoa.exibirPessoa();
		Helpers.divisorMaior();

		retorno = pessoa.toString();
		System.out.println(retorno);
		Helpers.divisorMaior();
		System.out.println("Utilizando método calcularIdade():");
		pessoa.calcularIdade();
	}

}
