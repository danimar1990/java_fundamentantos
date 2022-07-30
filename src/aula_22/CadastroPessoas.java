package aula_22;

import java.util.ArrayList;

public class CadastroPessoas {
	private ArrayList<String> Pessoa = new ArrayList<>();

	public ArrayList<String> getPessoa() {
		return Pessoa;
	}

	public void setPessoa(ArrayList<String> pessoa) {
		Pessoa = pessoa;
	}

	public void cadastraPessoa(String pess) {
		Pessoa.add(pess);
	}

	public void imprimeCadastro() {
		if (Pessoa.size() == 0) {
			System.out.println("Lista vazia!");
		} else {
			Pessoa.forEach(anotacao -> {
				System.out.println(Pessoa);
			});
		}
	}
}
