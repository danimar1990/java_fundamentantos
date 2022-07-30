package aula_22.teste;

import java.util.ArrayList;

public class CadastroPessoas {
	private ArrayList<Pessoa> listapessoas = new ArrayList<>();

	public void cadastraPessoa(Pessoa pessoa) {
		listapessoas.add(pessoa);
	}

	public void imprimeCadastro() {
		for (int i = 0; i < listapessoas.size(); i++) {
			System.out.println("Pessoa: " + (i + 1));
			listapessoas.get(i).imprimeDados();
			System.out.println();
		}
	}

}
