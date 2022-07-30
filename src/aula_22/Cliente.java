package aula_22;

public class Cliente extends Pessoa {
	private int codigo;

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente(int codigo) {
		super();
		this.codigo = codigo;
	}

	void imprimeDados() {
		System.out.println(codigo);
	}

	public int getCodigo() {
		return codigo;
	}

	public Cliente() {
		super();
	}

}
