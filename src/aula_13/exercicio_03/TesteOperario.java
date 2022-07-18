package aula_13.exercicio_03;

import java.text.DecimalFormat;

public class TesteOperario {

	public static void main(String[] args) {
		Operario operario = new Operario("Pedro Catavento", "(49) 9 1234-5678", 4, 3600d, 150d, 350d, 8d);

		System.out.println("Operário: " + operario.getNome());
		System.out.println("Telefone: " + operario.getTelefone());
		System.out.println("Setor: " + operario.getCodigoSetor());
		System.out.println("Salário base: R$" + new DecimalFormat("#,##0.00").format(operario.getSalarioBase()));
		System.out.println("Imposto: R$" + new DecimalFormat("#,##0.00").format(operario.getImposto()));
		System.out.println("Comissão: " + operario.getComissao() + "%");
		System.out.println("Valor produção: R$" + new DecimalFormat("#,##0.00").format(operario.getValorProducao()));
		System.out.println("Salário líquido: R$" + new DecimalFormat("#,##0.00").format(operario.calcularSalario()));
	}

}
