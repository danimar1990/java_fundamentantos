package aula_16.exercicio_02;

public class EnsinoMedio extends Empresa {
	int ESCOLARIDADE = 2;

	public EnsinoMedio(String funcionario, int codigo, int escolaridade) {
		super(funcionario, codigo, escolaridade);
	}

	@Override
	public void getGrauEscolaridade(int escolaridade) {
		escolaridade = ESCOLARIDADE;
		System.out.println(escolaridade);
	}
}
