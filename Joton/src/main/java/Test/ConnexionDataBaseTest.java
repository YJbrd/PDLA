package Test;
import Controller.Connexion.*;


import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class ConnexionDataBaseTest {
	
	Connection con = null;

	
	@Before
	public void initTestEnvironment() {
	    // cette méthode est exécutée avant chaque test

	}
	
	@After
	public void destroyTestEnvironment() {
	    // cette méthode est exécutée après chaque test
	}
	  
	@Test
	void test() {
		con=Controller.Connexion.LogIn.seConnecter(pseudo, motDePasse);
		assertTrue(con,);
	
	}
	
}	
