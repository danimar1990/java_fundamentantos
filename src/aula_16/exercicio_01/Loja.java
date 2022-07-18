package aula_16.exercicio_01;

import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> listaProduto = new ArrayList<>();

		listaProduto.add(new Livro("O homem mais rico da babilônia!", 16.9, "George S. Clason"));
		listaProduto.add(new Livro("O poder do hábito", 48.99, "Charles Duhigg"));
		listaProduto.add(new Cd("Yellow Ledbetter", 5.55, 1, 8));
		listaProduto.add(new Cd("I'm not a Jesus", 9.4, 2, 6));
		listaProduto.add(new Dvd("AC/DC - Live in River Plate", 163.9, 120.0));
		listaProduto.add(new Dvd("Metallica - Master of Puppets", 120.9, 80));

		System.out.println("==============[PRODUTOS]==============");
		for (int i = 0; i < listaProduto.size(); i++) {
			System.out.println(listaProduto.get(i).toString());
		}
	}
}
