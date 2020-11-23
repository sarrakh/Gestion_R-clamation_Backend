package com.bezkoder.springjwt.models;



import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Reclamation {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
   

    private LocalDate Date_creation;
	private String Description;
	private LocalDate Date_Traitement;
	private String avancement ;
	private String Rapport ;
	

	@ManyToOne 

	Agent agents;
	
	@ManyToOne 

	Technicien techniciens;
	
	@ManyToOne 

	Etat etats;
	
	
	
	
	
	public Etat getEtats() {
		return etats;
	}

	public void setEtats(Etat etats) {
		this.etats = etats;
	}


	public Reclamation(Long id, LocalDate date_creation, String description, LocalDate date_Traitement,
			String avancement, String rapport, Agent agents, Technicien techniciens, Etat etats) {
		super();
		this.id = id;
		Date_creation = date_creation;
		Description = description;
		Date_Traitement = date_Traitement;
		this.avancement = avancement;
		Rapport = rapport;
		this.agents = agents;
		this.techniciens = techniciens;
		this.etats = etats;
	}










	public LocalDate getDate_Traitement() {
		return Date_Traitement;
	}










	public void setDate_Traitement(LocalDate date_Traitement) {
		Date_Traitement = date_Traitement;
	}










	public String getAvancement() {
		return avancement;
	}










	public void setAvancement(String avancement) {
		this.avancement = avancement;
	}


	public String getRapport() {
		return Rapport;
	}



	public void setRapport(String rapport) {
		Rapport = rapport;
	}




	public Reclamation() {
		super();
	}

	
	


	




	public Technicien getTechniciens() {
		return techniciens;
	}










	public void setTechniciens(Technicien techniciens) {
		this.techniciens = techniciens;
	}










	public Reclamation(Long id, LocalDate date_creation, String description, Agent agents, Technicien techniciens) {
		super();
		this.id = id;
		Date_creation = date_creation;
		Description = description;
		this.agents = agents;
		this.techniciens = techniciens;
	}










	public Agent getAgents() {
		return agents;
	}





	public void setAgents(Agent agents) {
		this.agents = agents;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public LocalDate getDate_creation() {
		return Date_creation;
	}

	public void setDate_creation(LocalDate date_creation) {
		Date_creation = date_creation;
	}


	

	

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}





	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", Date_creation=" + Date_creation + ", Description=" + Description
				+ ", Date_Traitement=" + Date_Traitement + ", avancement=" + avancement + ", Rapport=" + Rapport
				+ ", agents=" + agents + ", techniciens=" + techniciens + ", etats=" + etats + "]";
	}

	

	

	
	


	





	





	

	
	

	
	
}
