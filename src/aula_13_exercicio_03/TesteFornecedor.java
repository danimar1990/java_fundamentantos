package aula_13_exercicio_03;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor("Invelox Tecnologias", "Rua Laura Santos, 275, Joa�aba-SC, 89600-000",
				"(49) 9 9999-0733", 58245.51, 14253.23);

		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		System.out.println("Saldo: " + fornecedor.obterSaldo());
	}

}
