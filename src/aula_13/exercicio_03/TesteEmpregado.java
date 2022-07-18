package aula_13.exercicio_03;

import java.text.DecimalFormat;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Jo�o das Neves", "(49 )9 9999-6666", 3, 4200d, 345d);

		System.out.println("Empregado: " + empregado.getNome());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.println("Setor: " + empregado.getCodigoSetor());
		System.out.println("Sal�rio base: R$" + new DecimalFormat("#,##0.00").format(empregado.getSalarioBase()));
		System.out.println("Imposto: R$" + new DecimalFormat("#,##0.00").format(empregado.getImposto()));
		System.out.println("Sal�rio l�quido: R$" + new DecimalFormat("#,##0.00").format(empregado.calcularSalario()));
	}

}
