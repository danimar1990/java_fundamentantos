package aula_27_28.model;

public class Cliente extends Pessoa {
	private int codigo;

	@Override
	public String toString() {
		return "Cliente\n" + super.toString() + "\n[codigo=" + codigo + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
