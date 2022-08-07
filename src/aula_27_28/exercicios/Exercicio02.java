package aula_27_28.exercicios;

public class Exercicio02 {
	double numero1 = 1234.56;
	float numero2 = (float) numero1;

	int numero3 = 12;
	byte numero4 = (byte) numero3;

	public String getEnunciado() {
		String enunciado = "Corrija as linhas 5 e 8 do código abaixo utilizando o conceito de casting explícito.\n"
				+ "Acrescente o código para imprimir as variáveis numero2 e numero4.\n"
				+ "1 public class Teste {\n"
				+ "2\n"
				+ "3	public static void main(String[] args) {\n"
				+ "4		double numero1 = 1234.56;\n"
				+ "5		float numero2 = numero1;\n"
				+ "6\n"
				+ "7		int numer3 = 12;\n"
				+ "8		byte numero4 = numero3;\n7"
				+ "9	}\n"
				+ "10\n"
				+ "11 }";
		return enunciado;
	}

	public String getCorrecao() {
		return "Correção linha 5: float numero2 = (float) numero1;\n"
				+ "Correção linha 8: byte numero4 = (byte) numero3;";
	}

}
