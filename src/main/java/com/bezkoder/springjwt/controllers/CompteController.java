package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Compte;

import com.bezkoder.springjwt.repository.CompteRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class CompteController {
	@Autowired 
	private CompteRepository Compte;
	
	@GetMapping(value="/AllCompte")
	public List<Compte> listeCompte() {
		return Compte.findAll();
	}
	@GetMapping(value="/AllCompte/{id}")
	public Compte listeCompte(@PathVariable(name="id") Long id) {
		return Compte.findById(id).get();	}
	
	@PostMapping(value="/addCompte")
	public Compte save(@Validated  @RequestBody Compte u) {
	    return Compte.save(u);
	}
	@PutMapping(value="/updateCompte/{id}")
	public Compte update(@PathVariable(name="id") Long id,@RequestBody Compte u) {
	   u.setId(id);
		return Compte.save(u);
	}
	@DeleteMapping(value="/deleteCompte/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		Compte.deleteById(id);
	}
	
}
