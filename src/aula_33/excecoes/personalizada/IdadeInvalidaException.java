package aula_33.excecoes.personalizada;

public class IdadeInvalidaException extends Exception {

	private static final long serialVersionUID = 8137261947773928591L;
	private int idade;

	public IdadeInvalidaException(String mensagem, int idade) {
		super(mensagem);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}
}
