package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	private static Connection conexao = null;

	private FabricaConexao() {
	}

	public static Connection getConexao() {
		try {
			String url = "jdbc:mysql://localhost/unoesc_crud_jdbc";
			String usuario = "root";
			String senha = "";

			conexao = DriverManager.getConnection(url, usuario, senha);
			// System.out.println("Conexão realizada com sucesso!");

			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public static void fecharConexao() {
		if (conexao != null) {
			try {
				conexao.close();
				// System.out.println("Conexão fechada com sucesso!");
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

}
