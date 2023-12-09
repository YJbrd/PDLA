package Controller.Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class LogIn{
	
	public static boolean seConnecter(String nomUtilisateur, String motDePasse) {
        String query = "SELECT * FROM User WHERE nom_utilisateur = ? AND mot_de_passe = ?";
        try (Connection connection = ConnexionDataBase.getConnexionDataBase();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Param�trer les valeurs
            preparedStatement.setString(1, nomUtilisateur);
            preparedStatement.setString(2, motDePasse);

            // Ex�cuter la requ�te
            ResultSet resultSet = preparedStatement.executeQuery();

            // V�rifier si l'utilisateur existe dans la base de donn�es
            if (resultSet.next()) {
                System.out.println("Connexion r�ussie !");
                return true;
            } else {
                System.out.println("�chec de la connexion. Veuillez v�rifier vos informations d'identification.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander � l'utilisateur de saisir son nom d'utilisateur et son mot de passe
        System.out.print("Nom d'utilisateur : ");
        String nomUtilisateur = scanner.nextLine();

        System.out.print("Mot de passe : ");
        String motDePasse = scanner.nextLine();

        // Appeler la fonction de connexion
        seConnecter(nomUtilisateur, motDePasse);

        // Fermer le scanner
        scanner.close();
    }
}
