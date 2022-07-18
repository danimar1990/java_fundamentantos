package aula_12.exercicio_01;

public class Vendedor extends Empregado {
	private float percentualComissao;

	public Vendedor(String nome, float salario, float percentualComissao) {
		super.setNome(nome);
		super.salario = salario;
		this.percentualComissao = percentualComissao;
	}

	public float calcularSalario() {
		super.setSalario(super.getSalario() + (super.getSalario() * getPercentualComissao() / 100));
		return super.getSalario();
	}

	@Override
	public String toString() {
		return "Nome = " + super.getNome() + "\nSal�rio sem comiss�o = " + salario + "\nSal�rio com comiss�o = "
				+ this.calcularSalario() + "\nPercentual comiss�o = " + percentualComissao + "%";
	}

	public float getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

}
