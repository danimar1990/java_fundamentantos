package aula_38.dao;

import java.util.List;

import aula_38.model.Produto;

public interface IProdutoDAO {

	void adicionar(Produto p);

	void alterar(Produto p);

	void excluir(Integer id);

	List<Produto> listarTodos();

	Produto buscarPorId(Integer id);

}
