package aula_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();

		int contador;

		for (contador = 1; contador <= 5; contador++) {
			System.out.print("Digite um número: ");
			numeros.add(sc.nextInt());
			sc.close();
		}

		Collections.sort(numeros);
		numeros.forEach(numero -> {
			System.out.print(numero + " ");
		});

		System.out.println("");
		Collections.reverse(numeros);
		numeros.forEach(numero -> {
			System.out.print(numero + " ");
		});

	}

}
