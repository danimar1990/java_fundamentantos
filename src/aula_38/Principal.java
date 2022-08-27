package aula_38;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import aula_38.dao.ProdutoDAO;
import aula_38.model.Produto;
import helpers.Helpers;

public class Principal {

	public static void main(String[] args) {
		SimpleDateFormat fd = new SimpleDateFormat("dd/mm/yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();

		ProdutoDAO dao = new ProdutoDAO();

		// INÍCIO DE ADICIONAR PRODUTO
		Produto rtx3090ti = new Produto(null, "RTX3090TI 24GB", Date.valueOf(LocalDate.now()), 5,
				new BigDecimal("20000.5"));
		// dao.adicionar(rtx3090ti);

		Produto monitor = new Produto(null, "Monitor Asus Curvo HQ 34", Date.valueOf(LocalDate.now()), 5,
				new BigDecimal("3400"));
		// dao.adicionar(monitor);
		// FIM DE ADICIONAR PRODUTO

		// INÍCIO DE ALTERAR PRODUTO
		// monitor.setIdProd(3);
		// dao.alterar(monitor);
		// FIM DE ALTERAR PRODUTO

		// INÍCIO DA EXCLUSÃO DE UM PRODUTO
		//dao.excluir(4);
		// FIM DA EXCLUSÃO DE UM PRODUTO

		// INCÍCIO DA LISTAGEM DE PRODUTOS
		List<Produto> lista = dao.listarTodos();

		System.out.println("Lista de produtos");
		System.out.println("-----------------");

		for (Produto produto : lista) {
			System.out.println("ID...........: " + produto.getIdProd());
			System.out.println("Nome.........: " + produto.getNomeProd());
			System.out.println("Data cadastro: " + fd.format(produto.getDataCadastro()));
			System.out.println("Quantidade...: " + produto.getQuantidade());
			System.out.println("Preço........: " + fm.format(produto.getPreco()));
		}
		// FIM DA LISTAGEM DE PRODUTOS

		Helpers.divisorMaior();

		// INÍCIO DA BUSCA DO PRODUTO POR ID
		Produto prod = dao.buscarPorId(1);
		if (prod != null) {
			System.out.println("Produto encontrado!");
			System.out.println("ID...........: " + prod.getIdProd());
			System.out.println("Nome.........: " + prod.getNomeProd());
			System.out.println("Data cadastro: " + fd.format(prod.getDataCadastro()));
			System.out.println("Quantidade...: " + prod.getQuantidade());
			System.out.println("Preço........: " + fm.format(prod.getPreco()));
		} else {
			System.out.println("Produto não encontrado!");
		}
		// FIM DA BUSCA DO PRODUTO POR ID
	}

}
