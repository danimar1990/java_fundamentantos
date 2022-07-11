package aula_11;

public class IngressoVIP extends Ingresso {
	private Double valorAdicional;

	public IngressoVIP() {
	}

	public IngressoVIP(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "IngressoVIP = [valor + valorAdicional = " + (valorAdicional + super.getValor()) + "]";
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
