package aula_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Integer> numeros = new ArrayList<>();

			int contador;

			for (contador = 1; contador <= 5; contador++) {
				System.out.print("Digite um número: ");
				numeros.add(sc.nextInt());
			}

			System.out.println("O maior valor da lista é: " + Collections.max(numeros));
			System.out.println("O menor valor da lista é: " + Collections.min(numeros));
		}
	}

}
