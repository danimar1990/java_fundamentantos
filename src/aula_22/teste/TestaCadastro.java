package aula_22.teste;

public class TestaCadastro {
	public static void main(String[] args) {
		CadastroPessoas cadastroPessoas = new CadastroPessoas();

		Cliente cliente = new Cliente();
		cliente.setNome("Danimar Henrique Varisa");
		cliente.setCodigo(12436);

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Diego de Melo Varisa");
		funcionario.setSalario(12900);

		Gerente gerente = new Gerente();
		gerente.setNome("Jaqueline Candiago de OLiveira");
		gerente.setSalario(12500);
		gerente.setArea("Administradora");

		cadastroPessoas.cadastraPessoa(cliente);
		cadastroPessoas.cadastraPessoa(funcionario);
		cadastroPessoas.cadastraPessoa(gerente);

		cadastroPessoas.imprimeCadastro();
	}

}
