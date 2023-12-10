package Model.Tasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import Controller.Connexion.ConnexionDataBase;

public class Task {
	
	/**private String description;
	private Status s;
	private Date dateLimite;
	private boolean validation;
	
	public Task() {
		
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Status getStatus() {
		return this.s;
	}
	
	public Date getDateLimite() {
		return this.dateLimite;
	}**/
	
	public boolean isValidated() {
		//ajouter conditions spécifiques
		return false;
	}
	
	// Méthode pour enregistrer une nouvelle tÃ¢che
		public static void createNewTask(String description, int UserID, String dateLimite) {

		    String query = "INSERT INTO Task (ProprioID, Description, DateLimite) VALUES (?, ?, ?)";		//IDLE,
		    
		    try (Connection connection = ConnexionDataBase.getConnexionDataBase();
		         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

		        // Paramétrer les valeurs
		        preparedStatement.setString(2, description);
		        preparedStatement.setInt(1, UserID);
		        //preparedStatement.setString(3,"idle");
		        preparedStatement.setString(3, dateLimite);
		        

		        // Exécuter la requête
		        int rowCount = preparedStatement.executeUpdate();

		        // Vérifier si l'enregistrement a réussi
		        if (rowCount > 0) {
		            System.out.println("Tâche enregistrée ! Quelqu'un va bientôt venir vous aider");
		        } else {
		            System.out.println("Échec de l'enregistrement de la tâche. Veuillez réessayer.");
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
}
