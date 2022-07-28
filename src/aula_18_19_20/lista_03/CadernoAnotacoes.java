package aula_18_19_20.lista_03;

import java.util.ArrayList;

public class CadernoAnotacoes {

	ArrayList<String> listaAnotacoes = new ArrayList<>();

	public CadernoAnotacoes() {
	};

	String adicionarAnotacao(String anotacao) {
		listaAnotacoes.add(anotacao);
		return "Nota adicionada com sucesso!";
	}

	String visualizarAnotacoes() {

		if (listaAnotacoes.isEmpty()) {
			return ("Caderno de anotações vazio!");
		} else {
			String aux = ("Lista de anotações:" + "\n");
			for (String anotacao : listaAnotacoes) {
				aux += anotacao.toString() + "\n";
			}
			return aux;
		}
	}

	String apagarAnotacoes() {
		listaAnotacoes.clear();
		return "Notas excluídas com sucesso!";
	}

}
