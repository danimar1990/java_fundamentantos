package aula_33.excecoes.personalizada;

public class MenorDeIdadeException extends Exception {

	private static final long serialVersionUID = 8732664604838813447L;
	private int idade;

	public MenorDeIdadeException(String mensagem, int idade) {
		super(mensagem);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}
}
