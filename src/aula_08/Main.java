package aula_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import encapsulamento.ControleRemoto;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Pessoa pes = new Pessoa();

		System.out.println("Prencha os dados da pessoa:");
		System.out.print("Nome: ");
		pes.setNome(sc.next());
		System.out.print("Nascimento: ");
		pes.setAnoNasc(sc.nextInt());
		System.out.print("Altura: ");
		pes.setAltura(sc.nextDouble());

		pes.imprimeDadosPessoais();
		Main.separador();
		System.out.println("Via método toString():");
		String dadosPessoais;
		dadosPessoais = pes.toString();
		System.out.println(dadosPessoais);
		pes.toString();
		pes.calculaIdade();
		Main.separador();

		BufferedReader reader;
		reader = new BufferedReader(new InputStreamReader(System.in));
		ControleRemoto cr = new ControleRemoto();
		System.out.println("---[Controle remoto]---");
		System.out.println("1 Aumentar volume");
		System.out.println("2 Diminuir volume");
		System.out.println("3 Aumentar canal");
		System.out.println("4 Diminuir canal");
		System.out.println("Selecione uma opção acima:");
		String reply = reader.readLine();

		int opcao = Integer.parseInt(reply);

		while (opcao != 4) {
			switch (opcao) {
			case 1:
				cr.aumentarVolume();
				break;
			case 2:
				cr.diminuirVolume();
				break;
			case 3:
				cr.aumentarCanal();
				break;
			case 4:
				cr.diminuirCanal();
				break;
			}
		}
		sc.close();
	}

	public static void separador() {
		System.out.println("--------------------------------");
	}
}
