package aula_15.sobreposicao_classe;

public class ContaCPF extends Conta {

	@Override
	public void solicitarDocumentos() {
		System.out.println("Apresentar CPF");
	}

}
