package aula_16.exercicio_03;

public class Teste {
	public static void main(String[] args) {
		Assalariado a = new Assalariado("Danimar", "Varisa", "076.001.989-40", 2000);
		Comissionado c = new Comissionado("Danimar", "Varisa", "076.001.989-40", 80000, 12);
		Horista h = new Horista("Danimar", "Varisa", "076.001.989-40", 120, 40);

		System.out.println("O sal�rio do Assalariado �: R$" + a.vencimento() + "/m�s");
		System.out.println("O sal�rio do Comissionado �: R$" + c.vencimento() + "/m�s");
		System.out.println("O sal�rio do Horista �: R$" + h.vencimento() + "/m�s");

	}
}
