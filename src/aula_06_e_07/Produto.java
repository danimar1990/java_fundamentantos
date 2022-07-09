package aula_06_e_07;

public class Produto {
	String nome;
	Double peso;
	Double preco;
	Double precoFinal = 0d;
	Double porcentagem = 0d;

	public void aumentarPreco(Produto p) {
		if (p.preco < 50) {
			porcentagem = 20.0 / 100.0;
			precoFinal = p.preco + (porcentagem * p.preco);
			System.out.println("Porcentagem: " + porcentagem + "%");
			System.out.println("Valor final: R$" + precoFinal);
		} else {
			porcentagem = 10.0 / 100.0;
			precoFinal = p.preco + (porcentagem * p.preco);
			System.out.println("Porcentagem: " + porcentagem + "%");
			System.out.println("Valor final: R$" + precoFinal);
		}
	}
}
