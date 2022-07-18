package aula_06_e_07;

import java.util.ArrayList;
import java.util.Scanner;

import helpers.Helpers;

public class CadernoAnotacoes<E> {
	String anotacao;
	static String confirmaExclusao = "n";
	static int anotacoes;

	public static ArrayList<String> notas = new ArrayList<>();
	private static String anotacao1;
	private static String anotacao2;
	private static String anotacao3;

	public static void adicionarAnotacao(String anotacao1, String anotacao2, String anotacao3) {
		System.out.println("-----------[ Adicionando anotação ]-----------");
		System.out.println("Digite a sua primeira anotação: ");
		anotacao1 = Teste.sc.next();
		notas.add(anotacao1);
		System.out.println("Digite a sua segunda anotação: ");
		anotacao2 = Teste.sc.next();
		notas.add(anotacao2);
		System.out.println("Digite a sua terceira anotação: ");
		anotacao3 = Teste.sc.next();
		notas.add(anotacao3);
		System.out.println("Anotações adicionadas com sucesso!");
	}

	public static void visualizarAnotacoes() {
		System.out.println("Lista de anotações:");
		if (notas.isEmpty()) {

			System.out.println("Não existem anotações cadastradas!");
		} else {
			notas.forEach(nota -> {
				System.out.println(" -> " + nota);
			});
		}
	}

	public static void apagarAnotacoes(String confirmaExclusao) {
		System.out.println("Tem certeza que deseja apagar todos os registros? s/n");
		confirmaExclusao = Teste.sc.next();
		if (confirmaExclusao.equals("s")) {
			notas.clear();
			System.out.println("Anotações apagadas com sucesso!");
		} else {
			System.out.println("Operação cancelada!");
		}
	}

	public static void menu() {
		int opcao = 0;

		Scanner sc = new Scanner(System.in);

		while (opcao != 4) {
			System.out.println("-----------[ CADERNO DE ANOTAÇÕES ]-----------");
			System.out.println("1 - Adicionar anotação");
			System.out.println("2 - Visualizar anotações");
			System.out.println("3 - Apagar anotações");
			System.out.println();
			System.out.println("4 - Finalizar");
			Helpers.divisorMaior();
			System.out.print("Digite uma opção do menu acima: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				adicionarAnotacao(anotacao1, anotacao2, anotacao3);
				Helpers.sleep();
				break;
			case 2:
				visualizarAnotacoes();
				Helpers.sleep();
				break;
			case 3:
				apagarAnotacoes(confirmaExclusao);
				Helpers.sleep();
				break;
			case 4:
				System.out.println("Finalizando caderno de anotações!");
				System.out.println("Voltando ao menu principal..");
				Teste.menu();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
		sc.close();
	}
}
