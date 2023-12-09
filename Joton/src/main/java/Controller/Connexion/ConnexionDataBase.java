package Controller.Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition;

public class ConnexionDataBase {
	
	private Connection con = null; 
	public static Connection getConnexionDataBase() throws SQLException {
		
		try{			
			//charger le pilote JDBC 
			try {
				Class.forName("com.sql.cj.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			//étabblir la connexion
			con= (Connection)DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/","projet_gei_024", "uB4yo1Uj");
			System.out.println("Connecion établie avec succès");
			return con;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}	
}