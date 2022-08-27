package aula_39_40.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import aula_38.model.Produto;
import aula_39_40.model.Pessoa;
import db.FabricaConexao;

public class PessoaDAO implements IPessoaDAO {

	private Connection conexao;

	@Override
	public void adicionar(Pessoa p) {
		conexao = FabricaConexao.getConexao();

		try {
			String sql = "INSERT INTO pessoa (nome_pessoa, data_nascimento, salario) " + "VALUES (?, ?, ?)";

			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.setString(1, p.getNomePessoa());
			stmt.setDate(2, p.getDataNascimento());
			stmt.setBigDecimal(4, p.getSalario());

			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fecharConexao();
		}

	}

	@Override
	public void alterar(Pessoa p) {
		conexao = FabricaConexao.getConexao();

		try {
			String sql = "UPDATE pessoa SET nome_pessoa = ?, data_nascimento = ?, preco = ? " + "WHERE id_pessoa = ?";

			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.setString(1, p.getNomePessoa());
			stmt.setDate(2, p.getDataNascimento());
			stmt.setBigDecimal(4, p.getSalario());
			stmt.setInt(5, p.getIdPessoa());

			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fecharConexao();
		}

	}

	@Override
	public void excluir(Integer id) {
		conexao = FabricaConexao.getConexao();

		try {
			String sql = "DELETE FROM pessoa WHERE id_pessoa = ?";

			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.setInt(1, id);
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fecharConexao();
		}
	}

	@Override
	public List<Pessoa> listarTodas() {
		conexao = FabricaConexao.getConexao();

		List<Pessoa> lista = new ArrayList<>();

		try {
			String sql = "SELECT * FROM pessoa";

			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoa p = new Pessoa();

				p.setIdPessoa(rs.getInt("id_pessoa"));
				p.setNomePessoa(rs.getString("nome_pessoa"));
				p.setDataNascimento(rs.getDate("data_nascimento"));
				p.setSalario(rs.getBigDecimal("salario"));

				lista.add(p);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fecharConexao();
		}

		return lista;
	}

	@Override
	public Pessoa buscarPorId(Integer id) {
		conexao = FabricaConexao.getConexao();

		Pessoa p = null;

		try {
			String sql = "SELECT * FROM produto WHERE id_prod = ?";

			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				p = new Pessoa();

				p.setIdPessoa(rs.getInt("id_pessoa"));
				p.setNomePessoa(rs.getString("nome_pessoa"));
				p.setDataNascimento(rs.getDate("data_nascimento"));
				p.setSalario(rs.getBigDecimal("salario"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			FabricaConexao.fecharConexao();
		}

		return p;
	}

}
