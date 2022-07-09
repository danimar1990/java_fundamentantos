package aula_13_exercicio_02;

public class Imovel {
	private String endereco;
	private Double preco;

	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
