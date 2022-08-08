package aula_27_28.exercicios;

public class Exercicio09 {
	public String getEnunciado() {
		String enunciado = "Use o recurso de autoboxing do Java para atribuir as variáveis primitivas num1, "
				+ "num2 e num3 às suas respectivas classes wrapper."
				+ "\n 1 public class TesteConversoes {"
				+ "\n 2"
				+ "\n 3	public static void main(String[] args) {"
				+ "\n 4		Integer num1 = 123;"
				+ "\n 5		String valor1 = ...;"
				+ "\n 6		System.out.println(valor1);"
				+ "\n 7	"
				+ "\n 8		double num2 = 789.01;"
				+ "\n 9		String valor2 = ...;"
				+ "\n10		System.out.println(valor2);"
				+ "\n11	}"
				+ "\n12"
				+ "\n13 }";
		return enunciado;
	}
	
	public void teste() {
		Integer num1 = 123;
		String valor1 = String.valueOf(num1);
		System.out.println("int convertido para String: " + valor1);

		double num2 = 789.01;
		String valor2 = String.valueOf(num2);
		System.out.println("double convertido para String: " + valor2);
	}
}
