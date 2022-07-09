package aula_13_exercicio_02;

public class Velho extends Imovel {
	private Double desconto;

	public Velho(String endereco, double valor, double desconto) {
		super(endereco, valor - desconto);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
