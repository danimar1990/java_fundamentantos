package aula_31.exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {

		// Cria um objeto representando o arquivo em disco
		File arquivo = new File("c:\\temp\\arquivo.txt");

		// Abre o arquivo usando o objeto arquivo
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				// Lê a próxima linha e mostra na tela
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!\n" + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
