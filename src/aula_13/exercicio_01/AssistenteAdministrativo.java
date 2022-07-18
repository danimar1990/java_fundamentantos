package aula_13.exercicio_01;

import java.text.DecimalFormat;

public class AssistenteAdministrativo extends Assistente {
	private Double adicionalNoturno;

	public AssistenteAdministrativo(String nome, double salario, int matricula, double adicionalNoturno) {
		super(nome, salario, matricula);
		this.adicionalNoturno = adicionalNoturno;
		super.addAumento(adicionalNoturno);
	}
	
	@Override
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Aumento: R$" + new DecimalFormat("#,##0.00").format(adicionalNoturno));
	}

	public Double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(Double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

}
