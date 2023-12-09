package Controller.Connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register {

	// Méthode pour enregistrer un nouvel utilisateur
	public static void enregistrerUtilisateur(String nomUtilisateur, String motDePasse, String typeUtilisateur) {
	    String query = "INSERT INTO User (UserPseudo, UserPassword, UserType) VALUES (?, ?, ?)";
	    try (Connection connection = ConnexionDataBase.getConnexionDataBase();
	         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	        // Paramétrer les valeurs
	        preparedStatement.setString(1, nomUtilisateur);
	        preparedStatement.setString(2, motDePasse);
	        preparedStatement.setString(3, typeUtilisateur);

	        // Exécuter la requête
	        int rowCount = preparedStatement.executeUpdate();

	        // Vérifier si l'enregistrement a réussi
	        if (rowCount > 0) {
	            System.out.println("Enregistrement réussi !");
	        } else {
	            System.out.println("Échec de l'enregistrement. Veuillez réessayer.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Demander à l'utilisateur de saisir un nom d'utilisateur et un mot de passe
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
