package com.bezkoder.springjwt.models;


import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
public class Type  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy="type",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Agent> agents;
	
	public Type() {

	}
	

	


	public Type(Long id, String name, Set<Agent> agents) {
		super();
		this.id = id;
		this.name = name;
		this.agents = agents;
	}





	public Set<Agent> getAgents() {
		return agents;
	}





	public void setAgents(Set<Agent> agents) {
		this.agents = agents;
	}





	public void setId(Long id) {
		this.id = id;
	}


	public Type(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "Role [id=" + id + ", name=" + name + ", agents=" + agents + "]";
	}
	
}