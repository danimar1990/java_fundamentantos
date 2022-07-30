package aula_23_24;

public final class Produto extends Venda {

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public Produto() {
		super();
	}

	public Produto(String nome, double preco, int quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public boolean verificarEstoque(Produto prod) {
		if (prod.getQuantidadeEstoque() > 0) {
			prod.setQuantidadeEstoque(prod.getQuantidadeEstoque() - 1);
			return true;
		} else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

}
