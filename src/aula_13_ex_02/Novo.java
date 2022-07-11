package aula_13_ex_02;

public class Novo extends Imovel {
	private Double precoAdicional;

	public Novo(String endereco, double valor, double precoAdicional) {
		super(endereco, valor + precoAdicional);
		this.precoAdicional = precoAdicional;
	}

	public Double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(Double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}

}
