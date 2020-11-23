package com.bezkoder.springjwt.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Technicien extends User {
	    
	    private LocalDate Date_naiss;
	    private String departement;
		private String grade;
		
		private Long cin;
		@JsonIgnore
		@OneToMany(mappedBy="techniciens",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
		private Set<Reclamation> reclamations;
		
		public Technicien() {
			super();
		}



		public Technicien(LocalDate date_naiss, String departement, String grade, Long cin,
				Set<Reclamation> reclamations) {
			super();
			Date_naiss = date_naiss;
			this.departement = departement;
			this.grade = grade;
			this.cin = cin;
			this.reclamations = reclamations;
		}



		public Long getCin() {
			return cin;
		}



		public void setCin(Long cin) {
			this.cin = cin;
		}



		public LocalDate getDate_naiss() {
			return Date_naiss;
		}



		public void setDate_naiss(LocalDate date_naiss) {
			Date_naiss = date_naiss;
		}



		public String getDepartement() {
			return departement;
		}



		public void setDepartement(String departement) {
			this.departement = departement;
		}



		public String getGrade() {
			return grade;
		}



		public void setGrade(String grade) {
			this.grade = grade;
		}



		


		



		



		public Technicien(LocalDate date_naiss, String departement, String grade, Set<Reclamation> reclamations) {
			super();
			Date_naiss = date_naiss;
			this.departement = departement;
			this.grade = grade;
			this.reclamations = reclamations;
		}



		@Override
		public String toString() {
			return "Technicien [Date_naiss=" + Date_naiss + ", departement=" + departement + ", grade=" + grade
					+ ", cin=" + cin + ", reclamations=" + reclamations + "]";
		}



		public Set<Reclamation> getReclamations() {
			return reclamations;
		}



		public void setReclamations(Set<Reclamation> reclamations) {
			this.reclamations = reclamations;
		}

		

		


		
		
		
		
		
}
