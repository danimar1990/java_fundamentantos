package aula_33.excecoes.lancamento;

public class ExemploLancamentoFalhado {

	public static void main(String[] args) {
		sacar(600);
	}

	@SuppressWarnings("unused")
	private static void sacar(double valor) {
		if (valor > 500) {
			IllegalArgumentException erro = new IllegalArgumentException();
		}
	}
}
