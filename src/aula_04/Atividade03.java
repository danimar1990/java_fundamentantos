package aula_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();

		int contador;

		for (contador = 1; contador <= 5; contador++) {
			System.out.print("Digite um n�mero: ");
			numeros.add(sc.nextInt());
		}

		System.out.println("O maior valor da lista �: " + Collections.max(numeros));
		System.out.println("O menor valor da lista �: " + Collections.min(numeros));
	}

}
