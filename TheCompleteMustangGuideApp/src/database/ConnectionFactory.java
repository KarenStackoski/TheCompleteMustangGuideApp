package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection
	(
			String adressIp,
			String adressPort,
			String nameDatabase,
			String userDatabase,
			String passwordDatabase
	) throws SQLException
	{
		return DriverManager.getConnection
				(
					"jdbc:mysql://" + adressIp + ":" + adressPort + "/" + nameDatabase, 
					userDatabase, 
					passwordDatabase
				);
	}
}
