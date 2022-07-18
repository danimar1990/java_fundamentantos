package aula_16.exercicio_02;

public class EnsinoBasico extends Empresa {
	int ESCOLARIDADE = 1;

	public EnsinoBasico(String funcionario, int codigo, int escolaridade) {
		super(funcionario, codigo, escolaridade);
	}

	@Override
	public void getGrauEscolaridade(int escolaridade) {
		escolaridade = ESCOLARIDADE;
		System.out.println(escolaridade);
	}
}
