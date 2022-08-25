package aula_36.exercicios.exercicio03;

public class SaldoInsuficienteContaEspecialException extends Throwable {

	private static final long serialVersionUID = 5806132796030850983L;
	private double valor;

	public SaldoInsuficienteContaEspecialException(String mensagem, double valor) {
		super(mensagem);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
