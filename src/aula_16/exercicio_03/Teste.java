package aula_16.exercicio_03;

public class Teste {
	public static void main(String[] args) {
		Assalariado a = new Assalariado("Danimar", "Varisa", "076.001.989-40", 2000);
		Comissionado c = new Comissionado("Danimar", "Varisa", "076.001.989-40", 80000, 12);
		Horista h = new Horista("Danimar", "Varisa", "076.001.989-40", 120, 40);

		System.out.println("O salário do Assalariado é: R$" + a.vencimento() + "/mês");
		System.out.println("O salário do Comissionado é: R$" + c.vencimento() + "/mês");
		System.out.println("O salário do Horista é: R$" + h.vencimento() + "/mês");

	}
}
