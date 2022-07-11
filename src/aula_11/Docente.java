package aula_11;

public class Docente extends Funcionario {
	private String titulacao;
	private int nivel;

	@Override
	public double calcularSalario() {
		super.setSalario(super.getSalario() + this.getNivel());
		return super.getSalario();
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
