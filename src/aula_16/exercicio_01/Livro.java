package aula_16.exercicio_01;

public class Livro extends Produto {
	private String autor;

	public Livro(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "\n====[ Livro ]====\n" + super.toString() + "\nAutor: " + autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
