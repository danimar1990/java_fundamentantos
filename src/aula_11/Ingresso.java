package aula_11;

public class Ingresso {
	private Double valor;

	public Ingresso() {
		super();
	}

	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + "]";
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

}
