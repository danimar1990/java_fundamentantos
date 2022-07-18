package aula_13.exercicio_01;

import java.text.DecimalFormat;

public class AssistenteTecnico extends Assistente {
	private Double bonusSalarial;

	public AssistenteTecnico(String nome, double salario, int matricula, double bonusSalarial) {
		super(nome, salario, matricula);
		this.bonusSalarial = bonusSalarial;
		super.addAumento(bonusSalarial);
	}
	
	@Override
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Aumento: R$" + new DecimalFormat("#,##0.00").format(bonusSalarial));
	}

	public Double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(Double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

}
