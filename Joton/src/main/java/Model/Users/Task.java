package Model.Users;

import java.util.Date;

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
}
