package aula_08.encapsulamento;

public class Carro {
	private String modelo;
	private String marca;
	private int ano;

	public Carro() {
		super();
	}

	public Carro(String modelo, String marca, int ano) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
