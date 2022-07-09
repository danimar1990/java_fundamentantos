package aula_03;

public class Exercicio07 {

	public static void main(String[] args) {
		int tamanhoZe = 110;
		int tamanhoChico = 150;
		int anos = 0;

		while (tamanhoZe < tamanhoChico) {
			tamanhoChico = tamanhoChico + 2;
			tamanhoZe = tamanhoZe + 3;
			anos++;
		}

		System.out.println("Serão necessários " + anos + " anos para Zé se tornar maior do que Chico!");

	}
	
}
