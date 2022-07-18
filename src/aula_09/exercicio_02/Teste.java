package aula_09.exercicio_02;

public class Teste {

	public static void main(String[] args) {
		Elevador elevador = new Elevador().inicializa(10, 5);

		elevador.entra();
		elevador.entra();
		elevador.sobe();
		elevador.sai();
		elevador.sobe();
		elevador.sai();
		elevador.sai();
		elevador.entra();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();

		for (int i = 0; i < 11; i++) {
			elevador.sobe();
		}
	}
}
