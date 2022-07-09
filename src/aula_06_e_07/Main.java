package aula_06_e_07;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		menu();
		sc.close();
	}

	public static void menu() {
		int opcao = 0;

		while (opcao != 7) {
			System.out.println("-------------[ MENU DO SISTEMA ]--------------");
			System.out.println("1 - Calculadora");
			System.out.println("2 - Média do aluno");
			System.out.println("3 - Conta bancária");
			System.out.println("4 - Manutenção veículo");
			System.out.println("5 - Anotações");
			System.out.println("6 - Produtos");
			System.out.println();
			System.out.println("7 - Finalizar");
			Helpers.divisormaior();
			System.out.print("Digite uma opção do menu acima: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				exercicio1();
				Helpers.sleep();
				break;
			case 2:
				exercicio2();
				Helpers.sleep();
				break;
			case 3:
				exercicio3();
				Helpers.sleep();
				break;
			case 4:
				exercicio4();
				Helpers.sleep();
				break;
			case 5:
				exercicio5();
				Helpers.sleep();
				break;
			case 6:
				exercicio6();
				Helpers.sleep();
				break;
			case 7:
				System.out.println("Adeus, meu jovem!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

	public static void exercicio1() {
		Calculadora calc = new Calculadora();
		System.out.println();
		System.out.println("---------------[ Calculadora ]----------------");
		System.out.print("Informe o 1º número: ");
		calc.n1 = sc.nextDouble();
		System.out.print("Informe o 2º número: ");
		calc.n2 = sc.nextDouble();

		System.out.println();
		calc.somar(calc.n1, calc.n2);
		System.out.println();
		calc.subtrair(calc.n1, calc.n2);
		System.out.println();
		calc.multiplicar(calc.n1, calc.n2);
		System.out.println();
		calc.dividir(calc.n1, calc.n2);
	}

	public static void exercicio2() {
		Aluno alc = new Aluno();

		System.out.println();
		System.out.println("--------------[ Média do aluno ]--------------");
		System.out.print("Nome: ");
		alc.nome = sc.next();
		System.out.print("Idade: ");
		alc.idade = sc.nextInt();
		System.out.print("1ª nota: ");
		alc.n1 = sc.nextDouble();
		System.out.print("2ª nota: ");
		alc.n2 = sc.nextDouble();
		System.out.print("3ª nota: ");
		alc.n3 = sc.nextDouble();

		System.out.println();
		alc.getDadosAluno();
		alc.calcularMedia(alc.n1, alc.n2, alc.n3);
		alc.verificarAprovacao(alc.media);
	}

	public static void exercicio3() {
		Conta conta = new Conta();
		conta.menu();
	}

	private static void exercicio4() {
		Veiculo vcl = new Veiculo();

		System.out.println("------------[ Manutenção veículo ]------------");
		System.out.println("Preencha as informações");
		System.out.print("Modelo: ");
		vcl.modelo = sc.next();
		System.out.print("Ano: ");
		vcl.ano = sc.nextInt();
		System.out.print("Cor: ");
		vcl.cor = sc.next();
		System.out.print("Quilometragem: ");
		vcl.quilometragem = sc.nextDouble();
		System.out.println();
		vcl.verificarManutencao();
		vcl.exibirCor();
		System.out.print("Informe a nova cor do veículo: ");
		String novaCor = sc.next();
		vcl.mudarCor(novaCor);
	}

	private static void exercicio5() {
		CadernoAnotacoes.menu();
	}

	private static void exercicio6() {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();

		System.out.println("-----------------[ Produtos ]-----------------");
		System.out.println("Produto 1");
		System.out.print("Nome: ");
		p1.nome = sc.next();
		System.out.print("Peso: ");
		p1.peso = sc.nextDouble();
		System.out.print("valor: ");
		p1.preco = sc.nextDouble();
		p1.aumentarPreco(p1);
		Helpers.divisorMenor();

		System.out.println("Produto 2");
		System.out.print("Nome: ");
		p2.nome = sc.next();
		System.out.print("Peso: ");
		p2.peso = sc.nextDouble();
		System.out.print("valor: ");
		p2.preco = sc.nextDouble();
		p2.aumentarPreco(p2);
		Helpers.divisorMenor();

		System.out.println("Produto 3");
		System.out.print("Nome: ");
		p3.nome = sc.next();
		System.out.print("Peso: ");
		p3.peso = sc.nextDouble();
		System.out.print("valor: ");
		p3.preco = sc.nextDouble();
		p3.aumentarPreco(p3);
	}

}
