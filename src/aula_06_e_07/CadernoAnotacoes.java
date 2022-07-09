package aula_06_e_07;

import java.util.ArrayList;
import java.util.Scanner;

public class CadernoAnotacoes<E> {
	String anotacao;
	static String confirmaExclusao = "n";
	static int anotacoes;
	
	public static ArrayList<String> notas = new ArrayList<>();
	private static String anotacao1;
	private static String anotacao2;
	private static String anotacao3;

	public static void adicionarAnotacao(String anotacao1, String anotacao2, String anotacao3) {
		System.out.println("-----------[ Adicionando anota��o ]-----------");
		System.out.println("Digite a sua primeira anota��o: ");
		anotacao1 = Main.sc.next();
		notas.add(anotacao1);
		System.out.println("Digite a sua segunda anota��o: ");
		anotacao2 = Main.sc.next();
		notas.add(anotacao2);
		System.out.println("Digite a sua terceira anota��o: ");
		anotacao3 = Main.sc.next();
		notas.add(anotacao3);
		System.out.println("Anota��es adicionadas com sucesso!");
	}

	public static void visualizarAnotacoes() {
		System.out.println("Lista de anota��es:");
		if (notas.isEmpty()) {
			
			System.out.println("N�o existem anota��es cadastradas!");
		} else {
			notas.forEach(nota -> {
				System.out.println(" -> " + nota);
			});
		}
	}

	public static void apagarAnotacoes(String confirmaExclusao) {
		System.out.println("Tem certeza que deseja apagar todos os registros? s/n");
		confirmaExclusao = Main.sc.next();
		if (confirmaExclusao.equals("s")) {
			notas.clear();
			System.out.println("Anota��es apagadas com sucesso!");
		} else {
			System.out.println("Opera��o cancelada!");
		}
	}

	public static void menu() {
		int opcao = 0;
		
		Scanner sc = new Scanner(System.in);

		while (opcao != 4) {
			System.out.println("-----------[ CADERNO DE ANOTA��ES ]-----------");
			System.out.println("1 - Adicionar anota��o");
			System.out.println("2 - Visualizar anota��es");
			System.out.println("3 - Apagar anota��es");
			System.out.println();
			System.out.println("4 - Finalizar");
			Helpers.divisormaior();
			System.out.print("Digite uma op��o do menu acima: ");
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
				System.out.println("Finalizando caderno de anota��es!");
				System.out.println("Voltando ao menu principal..");
				Main.menu();
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}
		sc.close();
	}
}
