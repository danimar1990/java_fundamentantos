package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	private static Connection conexao = null;

	private FabricaConexao() {
	}

	public static Connection getConexao() {
		try {
			if (conexao != null && conexao.isClosed()) {
				return conexao;
			}

			Properties prop = loadProperties();

			final String url = prop.getProperty("url");
			final String usuario = prop.getProperty("usuario");
			final String senha = prop.getProperty("senha");

			System.out.println("Estabelecendo conexão com o banco de dados...");
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão realizada com sucesso!");

			return conexao;
		} catch (SQLException | IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	public static void fecharConexao() {
		if (conexao != null) {
			try {
				System.out.println("Finalizando conexão com o banco de dados...");
				conexao.close();
				System.out.println("Conexão finalizada com sucesso!");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	private static Properties loadProperties() throws FileNotFoundException, IOException {
		try (FileInputStream fs = new FileInputStream("C:\\Users\\Danimar-Desk\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\FormacaoDevs\\src\\db\\db.properties")) {
			Properties prop = new Properties();
			prop.load(fs);

			return prop;
		}
	}
}
