package aula_11_exercicio_01;

public class Ingresso {
	private Double valor;

	public Ingresso() {
		super();
	}

	public Ingresso(Double valor) {
		super();
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + "]";
	}

}
