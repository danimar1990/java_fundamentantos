package aula_08;

import helpers.Helpers;

public class PrincipalPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		String retorno;

		System.out.println("Utilizando Setters:");
		pessoa.setNome("Pedro");
		pessoa.setAnoNasc(2000);
		pessoa.setAltura(1.75);

		pessoa.exibirPessoa();
		Helpers.divisormaior();

		retorno = pessoa.toString();
		System.out.println(retorno);
		Helpers.divisormaior();
		System.out.println("Utilizando método calcularIdade():");
		pessoa.calcularIdade();
	}

}
