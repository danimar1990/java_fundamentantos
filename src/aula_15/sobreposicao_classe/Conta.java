package aula_15.sobreposicao_classe;

public abstract class Conta {
	double taxa;

	// Obriga a implementação do método nas subclasses
	public abstract void solicitarDocumentos();

	public void calcularTaxa() {
		taxa = 5;
		System.out.println("Taxa: " + taxa);
	}
}
