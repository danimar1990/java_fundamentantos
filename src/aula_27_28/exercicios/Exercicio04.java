package aula_27_28.exercicios;

public class Exercicio04 {
	public String getEnunciado() {
		String enunciado = "Ainda usando a classe Math do Java faça um programa que calcule o IMC:\n"
				+ "a) O peso e a altura deverão ser solicitados ao usuário;\n"
				+ "b) O programa deverá imprimir o índice calculado e a classificação de acordo com a "
				+ "seguinte tabela:\n"
				+ "IMC			CLASSIFICAÇÃO\n"
				+ "MENOR QUE 18.5		MAGREZA\n"
				+ "ENTRE 18.5 E 24.9	NORMAL\n"
				+ "ENTRE 25.0 e 29.9	SOBREPESO\n"
				+ "ENTRE 30.0 e 39.9	OBESIDADE\n"
				+ "MAIOR QUE 40.0		OBESIDADE GRAVE"
				;
		return enunciado;
	}
	
	public void getIndiceMassaCorporal(double peso, double altura) {
		double imc = peso / (Math.pow(altura, 2));

		String aux = "Sua classificação é: ";
		
		if (imc <= 19)
			System.out.println(aux + "Abaixo do peso");
		else if (imc <= 25)
			System.out.println(aux + "Peso ideal");
		else if (imc <= 30)
			System.out.println(aux + "Acima do peso");
		else if (imc <= 35)
			System.out.println(aux + "Obesidade leve");
		else
			System.out.println(aux + "Obesidade grave"); 
	}

}
