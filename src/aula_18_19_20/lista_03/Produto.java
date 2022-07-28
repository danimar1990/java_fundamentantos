package aula_18_19_20.lista_03;

import java.text.DecimalFormat;

public class Produto {

	String nome;
	Double peso;
	Double preco;

	public Produto(String nome, Double peso, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}

	String aumentarPreco() {
		double reajuste;
		DecimalFormat decFormat = new DecimalFormat("#.##");
		String aux = "";
		aux = ("Produto " + nome + "\nPreço de custo: R$ " + decFormat.format(preco) + "\n");
		if (preco < 50) {
			reajuste = preco + (preco * 0.2);
		} else {
			reajuste = preco + (preco * 0.1);
		}
		preco = reajuste;
		aux = aux + ("Reajuste para venda: R$ " + decFormat.format(reajuste));
		return aux;
	}

}