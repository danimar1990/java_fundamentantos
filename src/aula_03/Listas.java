package aula_03;

import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		int contador;
		
		ArrayList<Integer> notas = new ArrayList<>();
		
		notas.add(10);
		notas.add(9);
		notas.add(8);
		
		for (contador = 0; contador < notas.size(); contador++) {
			System.out.println(notas.get(contador));
		}
		
		notas.forEach(x -> {
			System.out.println(x);
		});
	}
	
}
