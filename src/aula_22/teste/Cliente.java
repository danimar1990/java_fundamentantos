package aula_22.teste;

public class Cliente extends Pessoa {
	private int codigo;

	@Override
	public void imprimeDados() {
		System.out.println("Nome: " + super.getNome());
		System.out.println("Código: " + this.codigo);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
