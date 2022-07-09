package aula_13_exercicio_02;

import java.text.DecimalFormat;
import java.util.Scanner;

import aula_13_exercicio_01.Helpers;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Imovel imovel = new Imovel("Rua Martin Berkmiller, 13, Joa�aba-SC, 89600-000", 1000000);
		
		int opcao = 0;

		do {
			System.out.println("Digite o tipo do im�vel:");
			System.out.println("1 - Novo");
			System.out.println("2 - Velho");
			Helpers.divisormaior();
			System.out.print("Escolha uma op��o do menu acima: ");
			
			opcao = sc.nextInt();
		} while (opcao != 1 && opcao != 2);

		if (opcao == 1) {
			imovel = new Novo(imovel.getEndereco(), imovel.getPreco(), 55000);
		} else {
			imovel = new Velho(imovel.getEndereco(), imovel.getPreco(), 150000);
		}

		System.out.println("Valor do im�vel: R$ " + new DecimalFormat("#,##0.00").format(imovel.getPreco()));
		
		sc.close();
	}
}
