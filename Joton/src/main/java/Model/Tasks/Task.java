package Model.Tasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import Controller.Connexion.ConnexionDataBase;

public class Task {
	
	private String description;
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
	}
	
	public boolean isValidated() {
		//ajouter conditions spécifiques
		return false;
	}
	
	// M�thode pour enregistrer une nouvelle tâche
		public static void createNewTask(String description, int IDVuln, String dateLimite) {
			int VulnerableID=(Integer) null;
			
		    String query = "INSERT INTO Task (Description, Status, DateLimite, Validation, IDVulnerable) VALUES (?, ?, IDLE,?)";
		    
		    try (Connection connection = ConnexionDataBase.getConnexionDataBase();
		         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

		        // Param�trer les valeurs
		        preparedStatement.setString(1, description);
		        preparedStatement.setInt(2, IDVuln);
		        preparedStatement.setString(3,"idle");
		        preparedStatement.setString(4, dateLimite);
		        

		        // Ex�cuter la requ�te
		        int rowCount = preparedStatement.executeUpdate();

		        // V�rifier si l'enregistrement a r�ussi
		        if (rowCount > 0) {
		            System.out.println("Tache enregistrée ! Quelqu'un va bientôt venir vous aider");
		        } else {
		            System.out.println("Echec de l'enregistrement de la tâche Veuillez r�essayer.");
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
}
