package aula_13.exercicio_03;

import java.text.DecimalFormat;

public class TesteAdministrador {

	public static void main(String[] args) {
		Administrador admin = new Administrador("Danimar", "(49) 9 9999-0733", 1, 20000, 4650, 3400);

		System.out.println("Administrador: " + admin.getNome());
		System.out.println("Telefone: " + admin.getTelefone());
		System.out.println("Setor: " + admin.getCodigoSetor());
		System.out.println("Salário base: R$" + new DecimalFormat("#,##0.00").format(admin.getSalarioBase()));
		System.out.println("Imposto: R$ " + new DecimalFormat("#,##0.00").format(admin.getImposto()));
		System.out.println("Ajuda de custo: R$ " + new DecimalFormat("#,##0.00").format(admin.getAjudaDeCusto()));
		System.out.println("Salário líquido: R$ " + new DecimalFormat("#,##0.00").format(admin.calcularSalario()));
	}

}
