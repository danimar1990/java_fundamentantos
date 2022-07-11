package aula_09;

public class Principal01 {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();

		agenda.armazenaPessoa("Danimar", 32, 1.81);
		agenda.armazenaPessoa("Jaqueline", 31, 1.65);
		agenda.armazenaPessoa("Diego", 11, 1.60);

		System.out.println("---[Antes de remover pessoa]---");
		agenda.imprimeAgenda();

		agenda.removePessoa("Danimar");
		System.out.println();
		System.out.println("---[Depois de remover pessoa]---");
		agenda.imprimeAgenda();
		System.out.println();

		System.out.println("-------[Exibindo contato]-------");
		agenda.imprimePessoa(agenda.buscaPessoa("Diego"));

	}

}
