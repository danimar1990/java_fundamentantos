package aula_39_40.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import helpers.Helpers;

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
			Helpers.sleep();
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
				Helpers.sleep();
				System.out.println("Conexão finalizada com sucesso!");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	private static Properties loadProperties() throws FileNotFoundException, IOException {
		final String path = "C:\\Users\\Invelox Tecnologias\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Formacao Dev\\src\\aula_39_40\\db\\db.properties";
		try (FileInputStream fs = new FileInputStream(path)) {
			Properties prop = new Properties();
			prop.load(fs);

			return prop;
		}
	}
}
