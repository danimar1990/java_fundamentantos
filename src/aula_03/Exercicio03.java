package aula_03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int anos;
		int cigarrosPorDia;
		float valorUnitario;
		float gastoDia;
		float valorTotal;
		float valorCarteira;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos você fuma: ");
		anos = scanner.nextInt();
		System.out.println("Valor da carteira com 20 cigarros: ");
		valorCarteira = scanner.nextFloat();
		System.out.println("Quantos cigarros você fuma por dia? ");
		cigarrosPorDia = scanner.nextInt();
		scanner.close();
		valorUnitario = valorCarteira / 20;
		anos = anos * 365;
		gastoDia = cigarrosPorDia * valorUnitario;
		valorTotal = (gastoDia * anos);
		System.out.println("Valor total gasto: R$" + valorTotal);
		System.out.println("Fumou um total de " + (cigarrosPorDia * anos) + " cigarros");
	}

}
