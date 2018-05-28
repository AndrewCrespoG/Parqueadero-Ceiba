package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Conexion {
	protected Connection conexion;
	
	//JDBC driver nombre y bse de datos URL
	private final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://localhost:3306/parqueadero_ceiba";
	
	//Base de datos credenciales
	private final String USER = "root";
	private final String PASS = "";
	
	public void conectarBD() throws Exception {
		try {
			conexion = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
			//Class.forName(JDBC_DRIVER);
		}catch (Exception e) {
			throw e;
		}
	}
	
	public void cerrarConexion() throws SQLException {
		if (conexion != null) {
			if (!conexion.isClosed()) {
				conexion.close();
			}
		}
	}
}
