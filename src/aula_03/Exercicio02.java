package aula_03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float distancia;
		float consumo;
		float litros;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Km percorrido: ");
		distancia = scanner.nextFloat();
		System.out.println("Litros gastos: ");
		litros = scanner.nextFloat();
		scanner.close();
		consumo = distancia / litros;
		System.out.println("O consumo médio do veículo é de " + consumo + " km/l!");
	}
	
}
