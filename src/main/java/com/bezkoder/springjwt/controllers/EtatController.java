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

import com.bezkoder.springjwt.models.Etat;
import com.bezkoder.springjwt.repository.EtatRepo;




@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class EtatController {
	@Autowired 
	private EtatRepo etat;
	
	@GetMapping(value="/AllEtat")
	public List<Etat> listeEtat() {
		return etat.findAll();
	}
	@GetMapping(value="/AllEtat/{id}")
	public Etat listeEtat(@PathVariable(name="id") Long id) {
		return etat.findById(id).get();	}
	
	@PostMapping(value="/addEtat")
	public Etat save(@Validated  @RequestBody Etat u) {
	    return etat.save(u);
	}
	@PutMapping(value="/updateEtat/{id}")
	public Etat update(@PathVariable(name="id") Long id,@RequestBody Etat u) {
	   u.setId(id);
		return etat.save(u);
	}
	@DeleteMapping(value="/deleteEtat/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		etat.deleteById(id);
}
}
