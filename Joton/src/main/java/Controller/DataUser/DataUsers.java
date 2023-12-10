package Controller.DataUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Controller.Connexion.ConnexionDataBase;

public class DataUsers {
	
	private static String queryDemandes= null;
	private static String queryResultat= "Vous n'avez enregistr� aucune demande d'aide";

	
	private static DefaultListModel<String> listeDemandesModel=new DefaultListModel<>();

	public static DefaultListModel<String> getTasksList(int IDUser){
				
		
		queryDemandes = "SELECT * FROM Task WHERE ProprioID = ?";

        try (Connection connection = ConnexionDataBase.getConnexionDataBase();
            PreparedStatement preparedStatement = connection.prepareStatement(queryDemandes)){;
	        // Param�trer la valeur du nom d'utilisateur
	        preparedStatement.setInt(1, IDUser);


            // Ex�cuter la requ�te
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                
                while (resultSet.next()) {
                	// Si un enregistrement est trouv�, r�cup�rer les t�ches enregistr�es
	            	queryResultat = resultSet.getString("Description");
	            	System.out.println(queryResultat);
                	listeDemandesModel.addElement(queryResultat);
                }
            }
        } catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
        }
		return listeDemandesModel;

    }	
       
}

        

	