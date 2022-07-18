package aula_15.sobreposicao_classe;

public class Teste {
	public static void main(String[] args) {
		ContaCPF cpf = new ContaCPF();
		ContaCNPJ cnpj = new ContaCNPJ();

		// POLIMORFISMO DE SOBREPOSI��O
		// N�o pode realizar altera��es nos par�metros
		// Os m�todos n�o podem coexistir. Um m�todo sobrep�e o outro
		// Implementa��o na subclasse de um m�todo da superclasse.
		cpf.calcularTaxa();
		cnpj.calcularTaxa();
	}
}
