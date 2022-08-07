package aula_27_28.model;

public class Gerente extends Pessoa {

	public Gerente() {
		super();
	}

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public String toString() {
		return "Gerente [toString()=" + super.toString() + ", getNome()=" + getNome() + ", getTelefone()="
				+ getTelefone() + ", getCpf()=" + getCpf() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
