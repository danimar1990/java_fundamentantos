package aula_15.exercicio_01;

import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
	ArrayList<Animal> listaAnimais = new ArrayList<>();
	
		listaAnimais.add(new Homem());
		listaAnimais.add(new Homem());
		listaAnimais.add(new Homem());
		listaAnimais.add(new Homem());

		listaAnimais.add(new Cao());
		listaAnimais.add(new Cao());
		listaAnimais.add(new Cao());
		listaAnimais.add(new Cao());
		
		listaAnimais.add(new Gato());
		listaAnimais.add(new Gato());
		listaAnimais.add(new Gato());
		listaAnimais.add(new Gato());
		
		for(int cont = 0; cont < listaAnimais.size(); cont++) {
			listaAnimais.get(cont).falar();
		}
	}
}
