package com.bezkoder.springjwt.models;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Agent  extends User{
	
	
	private String Domaine;
	
	 
    
    @ManyToOne 
	Type type;

    @JsonIgnore
	@OneToMany(mappedBy="agents",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Reclamation> reclamations;



	public Agent() {
		super();
	}






	public Agent( String domaine, Type type, Set<Reclamation> reclamations) {
		super();
		
		Domaine = domaine;
		this.type = type;
		this.reclamations = reclamations;
	}





	@Override
	public String toString() {
		return "Agent [ Domaine=" + Domaine + ", type=" + type + ", reclamations=" + reclamations + "]";
	}




	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}





	public String getDomaine() {
		return Domaine;
	}



	public void setDomaine(String domaine) {
		Domaine = domaine;
	}



	


	


	public Set<Reclamation> getReclamations() {
		return reclamations;
	}



	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}





	



	


	
	
	

	
}
