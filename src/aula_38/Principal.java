package aula_38;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import aula_38.dao.ProdutoDAO;
import aula_38.model.Produto;

public class Principal {

	public static void main(String[] args) {
		SimpleDateFormat fd = new SimpleDateFormat("dd/mm/yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();

		ProdutoDAO dao = new ProdutoDAO();

		// INÍCIO DE ADICIONAR PRODUTO
		Produto rtx3090ti = new Produto(null, "RTX3090TI 24GB", Date.valueOf(LocalDate.now()), 5, new BigDecimal("20000.5"));
		//dao.adicionar(rtx3090ti);
		
		Produto monitor = new Produto(null, "Monitor Asus Curvo HQ 34", Date.valueOf(LocalDate.now()), 5, new BigDecimal("3400"));
		//dao.adicionar(monitor);
		// FIM DE ADICIONAR PRODUTO
		
		// INÍCIO DE ALTERAR PRODUTO
		//monitor.setIdProd(3);
		//dao.alterar(monitor);
		// FIM DE ALTERAR PRODUTO
		
		// INÍCIO DE EXCLUIR PRODUTO
		dao.excluir(4);
		// FIM DE EXCLUIR PRODUTO

		// INCÍCIO DE LISTAR PRODUTOS
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
		// FIM DE LISTAR PRODUTOS
	}

}
