package aula_27_28.exercicios;

public class Exercicio08 {
	public String getEnunciado() {
		String enunciado = "Use o recurso de autoboxing do Java para atribuir as variáveis primitivas num1, "
				+ "num2 e num3 às suas respectivas classes wrapper."
				+ "\n 1 public class TesteWrappers {"
				+ "\n 2"
				+ "\n 3	public static void main(String[] args) {"
				+ "\n 4		int num1 = 11;"
				+ "\n 5		float num2 = 22.22f;"
				+ "\n 6		double num3 = 33.33;"
				+ "\n 7	"
				+ "\n 8		// Aplicação de wrappers e auto boxing"
				+ "\n 9		Integer w1 = ..."
				+ "\n10		Float w2 = ..."
				+ "\n11		Double w3 = ..."
				+ "\n12"
				+ "\n13		System.out.println(w1);"
				+ "\n14		System.out.println(w1);"
				+ "\n15		System.out.println(w1);"
				+ "\n16	}"
				+ "\n17"
				+ "\n18 }";
		return enunciado;
	}

	public void teste() {
		int num1 = 11;
		float num2 = 22.22f;
		double num3 = 33.33;
		
		// Aplicação de wrappers e auto boxing"
		Integer w1 = num1;
		Float w2 = num2;
		Double w3 = num3;
		
		System.out.println("Conversão Integer para int: " + w1);
		System.out.println("Conversão Float para float: " + w2);
		System.out.println("Conversão Double para double: " + w3);
	}

}
