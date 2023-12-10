package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Users.user;

class RegisterTest {
	
	user u;
	
	@Before
	public void initTestRegister() {
	    // cette méthode est exécutée avant chaque test

	}
	
	@After
	public void destroyTestRegister() {
	    // cette méthode est exécutée après chaque test
	}
	

	@Test
	void test() {
		enregistrerUtilisateur(String nomUtilisateur, String motDePasse, String typeUtilisateur);
	}

}
