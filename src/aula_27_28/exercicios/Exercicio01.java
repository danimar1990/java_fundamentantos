package aula_27_28.exercicios;

public class Exercicio01 {
	public String getEnunciado() {
		String enunciado = "Crie um programa que declare uma variável do tipo int com o valor 12 e utilize\n"
				+ "conversão explícita (casting) para convertê-la para um tipo byte.\n"
				+ "A seguir crie uma variável double com o valor 1234.56 e utilize conversão\n"
				+ "explícita para convertê-la para um tipo float. Imprima na tela o resultado das\n"
				+ "conversões, ou seja, as variáveis byte e float.";
		return enunciado;
	}

	public byte convertIntToByte() {
		int numero1 = 12;
		return (byte) numero1;
	}

	public double convertDoubleToFloat() {
		double numero2 = 1234.56;
		return (float) numero2;
	}

	public byte getNumero1Convertido() {
		return this.convertIntToByte();
	}

	public double getNumero2Convertido() {
		return this.convertDoubleToFloat();
	}
}
