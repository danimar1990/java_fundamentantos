package aula_09_exercicio_01;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Pessoa> listaPessoas = new ArrayList<>(10);

	void armazenaPessoa(String nome, int idade, double altura) {
		Pessoa pessoa = new Pessoa(nome, idade, altura);
		listaPessoas.add(pessoa);
	}

	void removePessoa(String nome) {
		listaPessoas.remove(buscaPessoa(nome));
	}

	int buscaPessoa(String nome) {
		ArrayList<String> listaNomes = new ArrayList<>();
		listaPessoas.forEach(pessoa -> {
			listaNomes.add(pessoa.getNome());
		});
		return listaNomes.indexOf(nome);
	}

	void imprimeAgenda() {
		listaPessoas.forEach(pessoa -> {
			imprimePessoa(buscaPessoa(pessoa.getNome()));
		});
	}

	void imprimePessoa(int index) {
		Pessoa pessoa = listaPessoas.get(index);
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade() + " anos");
		System.out.println("Altura: " + pessoa.getAltura() + " metros");
		System.out.println("---");
	}

}
