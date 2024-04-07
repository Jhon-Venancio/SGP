package br.com.viertech.sgp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		
		String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=bdSGP;"
				+ "user=sa;"
				+ "password=Kjkszpj@1;"
				+ "encrypt=false;trustServerCertificate=false;";
		try {
			return DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
}
