package com.bezkoder.springjwt.models;



import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	
	private String adresse;
	private String Tel;
	
    @ManyToOne
    Compte cpt;
	
	public User() {
	}

	public User(Long id, String nom, String adresse, Compte cpt,String tel) {
		super();
		this.id = id;
		this.nom = nom;
		
		this.adresse = adresse;
		this.cpt = cpt;
		this.Tel=tel;
	}





	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public Compte getCpt() {
		return cpt;
	}


	public void setCpt(Compte cpt) {
		this.cpt = cpt;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	


	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	




	public String getAdresse() {
		return adresse;
	}





	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom +  ", adresse=" + adresse + ", Tel=" + Tel + ", cpt="
				+ cpt + "]";
	}

	

	

	
}
