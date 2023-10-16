package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {
	
	public void testConnexion() {
		// Connexion à la base myschema sur la machine localhost
		// en utilisant le login "username" et le password "password"
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/myschema", "username", "password");	
	}
	

}
