package aula_36.exercicios.exercicio03;

public class SaldoInsuficienteContaCorrenteException extends Throwable {

	private static final long serialVersionUID = -6472616943497252839L;
	private double valor;

	public SaldoInsuficienteContaCorrenteException(String mensagem, double valor) {
		super(mensagem);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
