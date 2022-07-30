package aula_23_24;

public final class TesteVenda {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		Produto produto4 = new Produto();

		Pagamento pag = new Pagamento();

		Venda venda = new Venda();

		produto1.setNome("Carne");
		produto1.setPreco(57.9);
		produto1.setQuantidadeEstoque(10);

		produto2.setNome("Macarrão");
		produto2.setPreco(4.82);
		produto2.setQuantidadeEstoque(50);

		produto3.setNome("Arroz");
		produto3.setPreco(14.99);
		produto3.setQuantidadeEstoque(5);

		produto4.setNome("Lazanha");
		produto4.setPreco(60);
		produto4.setQuantidadeEstoque(8);

		System.out.println("-----------------[ ESTOQUE ]------------------");
		System.out.println("Produto 1: " + produto1.getQuantidadeEstoque());
		System.out.println("Produto 2: " + produto2.getQuantidadeEstoque());
		System.out.println("Produto 3: " + produto3.getQuantidadeEstoque());
		System.out.println("Produto 4: " + produto4.getQuantidadeEstoque());

		System.out.println();

		venda.adicionarItemVenda(produto1);
		venda.adicionarItemVenda(produto2);
		venda.adicionarItemVenda(produto3);
		venda.adicionarItemVenda(produto4);
		pag.selecionarTipoPagamento(1);

		System.out.println("------------------[ VENDA ]-------------------");
		venda.visualizarVenda();

		System.out.println("-----------------[ PAGAMENTO ]----------------");
		venda.concluirVenda(pag);
	}
}
