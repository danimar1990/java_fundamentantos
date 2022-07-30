package aula_22;

public class TestaCadastro {
	public static void main(String[] args) {
		CadastroPessoas cadastroPessoas = new CadastroPessoas();

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Diego");
		funcionario.setSalario(12900);

		Gerente gerente = new Gerente();
		gerente.setNome("Jaqueline");
		gerente.setSalario(12500);
		gerente.setArea("Administradora");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Danimar Henrique Varisa");
		cliente.setCodigo(12436);

		cadastroPessoas.cadastraPessoa(funcionario);
		cadastroPessoas.cadastraPessoa(gerente);
		cadastroPessoas.cadastraPessoa(cliente);

		cadastroPessoas.imprimeCadastro();
	}

}
