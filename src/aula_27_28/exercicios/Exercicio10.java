package aula_27_28.exercicios;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio10 {
	public String getEnunciado() {
		String enunciado = "Use os métodos parseInt() e parseDouble() das classe Integer e Double "
				+ "nas linhas 10 e 19 para transformar as string em formatos numéricos. Complete "
				+ "o restante do código como solicitado nos comentários abaixo:"
				+ "\n 1 import java.text.NumberFormat;"
				+ "\n 2 import java.util.Locale;"
				+ "\n 3"
				+ "\n 4 public class TesteConversoes {"
				+ "\n 5	public static void main(String[] args) {"
				+ "\n 6		// Defina abaixo o Locale como US"
				+ "\n 7		Locale.setDefault(...);"
				+ "\n 8"
				+ "\n 9		String str1 = \"123456\";"
				+ "\n10		int num1 = ...;"
				+ "\n11"
				+ "\n12		// Imprima num1 usando NumberFormat incluindo o símbolo monetário"
				+ "\n13		System.out.println(...);"
				+ "\n14"
				+ "\n15		// Defina abaixo o Locale como português do Brasil"
				+ "\n16		Locale.setDefault(...);"
				+ "\n17"
				+ "\n18		String str2 = \"789.01\";"
				+ "\n19		double num2 = ...;"
				+ "\n20"
				+ "\n21		// Imprima num2 usando NumberFormat incluindo o símbolo monetário"
				+ "\n22		System.out.println(...);"
				+ "\n23	}"
				+ "\n24 }";
		return enunciado;
	}
	
	public void teste() {
		// Defina abaixo o Locale como US
		Locale.setDefault(new Locale("en-US"));

		NumberFormat formatoMoedaUS = NumberFormat.getCurrencyInstance();

		String str1 = "123456";
		int num1 = Integer.parseInt(str1);

		// Imprima num1 usando NumberFormat incluindo o símbolo monetário
		System.out.println(formatoMoedaUS.format(num1));

		// Defina abaixo o Locale como português do Brasil
		Locale.setDefault(new Locale("pt-BR"));

		NumberFormat formatoMoedaBR = NumberFormat.getCurrencyInstance();

		String str2 = "789.01";
		double num2 = Double.parseDouble(str2);

		// Imprima num2 usando NumberFormat incluindo o símbolo monetário
		System.out.println(formatoMoedaBR.format(num2));
	}
}
