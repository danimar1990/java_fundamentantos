package aula_13_ex_03;

import java.text.DecimalFormat;

public class TesteVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("Daniel Varisa", "(49) 9 9876-5432", 2, 9900d, 1670d, 100000d, 12d);

		System.out.println("Vendedor:" + vendedor.getNome());
		System.out.println("Telefone: " + vendedor.getTelefone());
		System.out.println("Setor: " + vendedor.getCodigoSetor());
		System.out.println("Sal�rio base: R$" + new DecimalFormat("#,##0.00").format(vendedor.getSalarioBase()));
		System.out.println("Imposto: R$" + new DecimalFormat("#,##0.00").format(vendedor.getImposto()));
		System.out.println("Comiss�o: " + vendedor.getComissao() + "%");
		System.out.println("Sal�rio + comiss�o: " + vendedor.getValorVendas());
		System.out.println("Sal�rio l�quido: R$" + new DecimalFormat("#,##0.00").format(vendedor.calcularSalario()));
	}

}
