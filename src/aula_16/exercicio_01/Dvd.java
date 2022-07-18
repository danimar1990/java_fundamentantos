package aula_16.exercicio_01;

public class Dvd extends Produto {
	private double duracao;

	public Dvd(String nome, double preco, double duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "\n====[ DVD ]====\n" + super.toString() + "\nDuração: " + duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

}
