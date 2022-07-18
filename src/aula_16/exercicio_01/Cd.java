package aula_16.exercicio_01;

public class Cd extends Produto {
	private int numero;
	private int faixas;

	public Cd(String nome, double preco, int numero, int faixas) {
		super(nome, preco);
		this.numero = numero;
		this.faixas = faixas;
	}

	@Override
	public String toString() {
		return "\n====[ CD ]====\n" + super.toString() + "\nNúmero: " + numero + "\nFaixas: " + faixas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

}
