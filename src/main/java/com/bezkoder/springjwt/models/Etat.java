package com.bezkoder.springjwt.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Etat {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy="etats",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Reclamation> reclamations;
	
	public Etat() {
		super();
	}
	
	

	

	public Etat(Long id, String name, Set<Reclamation> reclamations) {
		super();
		this.id = id;
		this.name = name;
		this.reclamations = reclamations;
	}





	public Set<Reclamation> getReclamations() {
		return reclamations;
	}





	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}





	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Etat [id=" + id + ", name=" + name + ", reclamations=" + reclamations + "]";
	}
	
	
	
	
}
