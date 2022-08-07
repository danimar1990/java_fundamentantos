package aula_27_28.exercicios;

public class Exercicio06 {
	public String getEnunciado() {
		String enunciado = "O código abaixo, estranhamente, está mostrando o resultado 1 (valor inteiro) "
				+ "em vez de 1.25 (valor em ponto flutuante). Modifique a linha 4 de forma que "
				+ "seja feita uma conversão implícita para float e na linha 5 faça um cast explícito"
				+ "\n1 public class Teste {"
				+ "\n2"
				+ "\n3	public static void main(String[] args) {"
				+ "\n4		System.out.println(\"10/8 = \" + 10/8);"
				+ "\n5		System.out.println(\"10/8 = \" + (...) 10/8);"
				+ "\n6	}"
				+ "\n7"
				+ "\n8 }";
		return enunciado;
	}
}
