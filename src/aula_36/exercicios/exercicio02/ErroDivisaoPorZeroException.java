package aula_36.exercicios.exercicio02;

public class ErroDivisaoPorZeroException extends ArithmeticException {

	private static final long serialVersionUID = 1911751198135136510L;
	private int numerador;

	public ErroDivisaoPorZeroException(String mensagem, int numero) {
		super(mensagem);
		this.numerador = numero;
	}

	public int getNumerador() {
		return this.numerador;
	}

}
