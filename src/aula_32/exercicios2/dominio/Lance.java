package aula_32.exercicios2.dominio;

public class Lance {
	private Usuario usuario;
	private double valor;

	public Lance(Usuario usuario, double valor) {
		this.usuario = usuario;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Lance [usuario=" + usuario + ", valor=" + valor + "]";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
