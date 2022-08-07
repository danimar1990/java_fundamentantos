package aula_27_28.exercicios;

public class Exercicio07 {
	public String getEnunciado() {
		String enunciado = "Em Java, constantes são definidas com a palavra chave final. A palavra chave static, por sua vez,\n"
				+ "indica que o atributo é acessado através da classe em si e não através de suas instâncias (objetos).\n"
				+ "Complete o código de forma a imprimir o conteúdo das constantes abaixo:"
				+ "\n 1 public class TesteConstantes {"
				+ "\n 2"
				+ "\n 3	final static double PI = 3.1415;"
				+ "\n 4	final long numero = 999_999L;"
				+ "\n 5	"
				+ "\n 6	public static void main(String[] args) {"
				+ "\n 7		final String NOME = \"DEV-TI\";"
				+ "\n 8"
				+ "\n 9		System.out.println(); Imprima aqui a constante PI"
				+ "\n10		System.out.println(); Imprima aqui a constante numero"
				+ "\n11		System.out.println(); Imprima aqui a constante NOME"
				+ "\n12	}"
				+ "\n13"
				+ "\n13 }";
		return enunciado;
	}
	
	public void getConstantes() {
		final double PI = 3.1415;
		final long NUMERO = 999_999L;
		final String NOME = "DEV-TI";
		
		System.out.println("Constante PI: " + PI);
		System.out.println("Constante NÚMERO: " + NUMERO);
		System.out.println("Constante NOME: " + NOME);
	}
}
