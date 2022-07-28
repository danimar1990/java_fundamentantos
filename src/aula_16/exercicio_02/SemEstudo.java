package aula_16.exercicio_02;

public class SemEstudo extends Empresa {
	final int ESCOLARIDADE = 0;

	public SemEstudo(String funcionario, int codigo, int escolaridade) {
		super(funcionario, codigo, escolaridade);
	}

	@Override
	public void getGrauEscolaridade(int escolaridade) {
		escolaridade = ESCOLARIDADE;
		System.out.println(escolaridade);
	}
}
