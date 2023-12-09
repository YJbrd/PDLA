package Controller.DataUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;

import Controller.Connexion.ConnexionDataBase;

public class DataUser {
	
	private static String queryDemandes= null;
	private static String queryResultat= "Vous n'avez enregistré aucune demande d'aide";

	
	private static DefaultListModel<String> listeDemandesModel;

	public static DefaultListModel<String> getTasksList(int IDUser){
		
		listeDemandesModel = null;
		
		for (int x=0; queryResultat.equals(null); x++) {
			queryDemandes = "SELECT * FROM Task WHERE ID_Task = ? AND ID_User = ?";
	        try (Connection connection = ConnexionDataBase.getConnexionDataBase();
	             PreparedStatement preparedStatement = connection.prepareStatement(queryDemandes)) {
	
	            // Param�trer la valeur du nom d'utilisateur
	            preparedStatement.setInt(2, IDUser);
	            preparedStatement.setInt(1, x);

	
	            // Ex�cuter la requ�te
	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                // Si un enregistrement est trouv�, r�cup�rer le type d'utilisateur
	                if (resultSet.next()) {
	                	queryResultat = resultSet.getString("Description");
	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			listeDemandesModel.addElement(queryResultat);
		}
		return listeDemandesModel;

	}
	

}
