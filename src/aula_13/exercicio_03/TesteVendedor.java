package aula_13.exercicio_03;

import java.text.DecimalFormat;

public class TesteVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("Daniel Varisa", "(49) 9 9876-5432", 2, 9900d, 1670d, 100000d, 12d);

		System.out.println("Vendedor:" + vendedor.getNome());
		System.out.println("Telefone: " + vendedor.getTelefone());
		System.out.println("Setor: " + vendedor.getCodigoSetor());
		System.out.println("Salário base: R$" + new DecimalFormat("#,##0.00").format(vendedor.getSalarioBase()));
		System.out.println("Imposto: R$" + new DecimalFormat("#,##0.00").format(vendedor.getImposto()));
		System.out.println("Comissão: " + vendedor.getComissao() + "%");
		System.out.println("Salário + comissão: " + vendedor.getValorVendas());
		System.out.println("Salário líquido: R$" + new DecimalFormat("#,##0.00").format(vendedor.calcularSalario()));
	}

}
