package aula_16.exercicio_02;

public class EnsinoSuperior extends Empresa {
	int ESCOLARIDADE = 3;

	public EnsinoSuperior(String funcionario, int codigo, int escolaridade) {
		super(funcionario, codigo, escolaridade);
	}

	@Override
	public void getGrauEscolaridade(int escolaridade) {
		escolaridade = ESCOLARIDADE;
		System.out.println(escolaridade);
	}
}
