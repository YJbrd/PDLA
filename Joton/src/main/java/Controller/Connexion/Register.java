package Controller.Connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register {

	// M�thode pour enregistrer un nouvel utilisateur
	public static void enregistrerUtilisateur(String nomUtilisateur, String motDePasse, String typeUtilisateur) {
	    String query = "INSERT INTO User (UserPseudo, UserPassword, UserType) VALUES (?, ?, ?)";
	    try (Connection connection = ConnexionDataBase.getConnexionDataBase();
	         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	        // Param�trer les valeurs
	        preparedStatement.setString(1, nomUtilisateur);
	        preparedStatement.setString(2, motDePasse);
	        preparedStatement.setString(3, typeUtilisateur);

	        // Ex�cuter la requ�te
	        int rowCount = preparedStatement.executeUpdate();

	        // V�rifier si l'enregistrement a r�ussi
	        if (rowCount > 0) {
	            System.out.println("Enregistrement r�ussi !");
	        } else {
	            System.out.println("�chec de l'enregistrement. Veuillez r�essayer.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Demander � l'utilisateur de saisir un nom d'utilisateur et un mot de passe
//        System.out.print("Nom d'utilisateur : ");
//        String nomUtilisateur = scanner.nextLine();
//
//        System.out.print("Mot de passe : ");
//        String motDePasse = scanner.nextLine();
//
//        // Appeler la fonction pour enregistrer l'utilisateur
//        enregistrerUtilisateur(nomUtilisateur, motDePasse);
//
//        // Fermer le scanner
//        scanner.close();
//    }
}
