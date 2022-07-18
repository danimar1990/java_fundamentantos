package aula_14.exercicio_02;

public class Teste {
	public static void main(String[] args) {
		Mamifero leao = new Mamifero("Leão", "Amarelo claro", "Terra", 190d, 4, 80, "Carne");
		Peixe tubarao = new Peixe("Baleia Jubarte", "Azul e tons de preto", "Mar", 3000d, 0, 2.9,
				"Consegue projetar mais de 2/3 de seu corpo para fora d'água");
		Mamifero guepardo = new Mamifero("Guepardo", "Amarelo pintado", "Terra", 150d, 4, 120, "Carne");

		leao.exibeDados();
		System.out.println();
		tubarao.exibeDados();
		System.out.println();
		guepardo.exibeDados();
		System.out.println();
	}
}
