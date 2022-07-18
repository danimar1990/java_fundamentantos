package aula_16.exercicio_02;

public abstract class Empresa {
	private String funcionario;
	private int codigo;
	private int escolaridade;
	// 0 - não estudou;
	// 1 - ensino básico;
	// 2 - ensino médio;
	// 3 - ensino superior;

	public Empresa(String funcionario, int codigo, int escolaridade) {
		super();
		this.funcionario = funcionario;
		this.codigo = codigo;
		this.escolaridade = escolaridade;
	}

	public abstract void getGrauEscolaridade(int escolaridade);

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(int escolaridade) {
		this.escolaridade = escolaridade;
	}

}
