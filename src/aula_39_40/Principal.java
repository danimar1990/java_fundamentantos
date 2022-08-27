package aula_39_40;

import java.util.Scanner;

import helpers.Helpers;

public class Principal {

	static private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {

		int opcao = 0;

		while (opcao != 6) {

			System.out.println("Bem vindo ao cadastro de pessoas! ");
			System.out.println();
			System.out.println("-------[ Menu do sistema ]--------");
			System.out.println("1. Incluir pessoa");
			System.out.println("2. Alterar pessoa");
			System.out.println("3. Excluir pessoa");
			System.out.println("4. Listar pessoas");
			System.out.println("5. Consultar pessoa");
			System.out.println();
			System.out.println("6. Sair");
			Helpers.divisorMenor();
			System.out.println("Selecione uma opção do menu acima:");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				incluir();
				break;
			case 2:
				alterar();
				break;
			case 3:
				excluir();
				break;
			case 4:
				listar();
				break;
			case 5:
				consultar();
				break;
			case 6:
				sair();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}

	public static void incluir() {
		System.out.println("Você selecionou o menu de cadastro!");
	}

	public static void alterar() {
		System.out.println("Você selecionou o menu de edição!");
	}

	public static void excluir() {
		System.out.println("Você selecionou o menu de exclusão!");
	}

	public static void listar() {
		System.out.println("Você selecionou o menu de listagem!");
	}

	public static void consultar() {
		System.out.println("Você selecionou o menu de busca!");
	}

	public static void sair() {
		System.out.println("Goodbye, friend!");
		System.exit(0);
	}

}
