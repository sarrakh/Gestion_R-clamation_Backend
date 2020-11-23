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

import com.bezkoder.springjwt.models.Administrateur;
import com.bezkoder.springjwt.repository.AdminRepo;




@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class AdminController {
	@Autowired 
	private AdminRepo admin;
	
	@GetMapping(value="/AllAdministrateur")
	public List<Administrateur> listeAdministrateur() {
		return admin.findAll();
	}
	@GetMapping(value="/AllAdministrateur/{id}")
	public Administrateur listeAdministrateur(@PathVariable(name="id") Long id) {
		return admin.findById(id).get();	}
	
	@PostMapping(value="/addAdministrateur")
	public Administrateur save(@Validated  @RequestBody Administrateur u) {
	    return admin.save(u);
	}
	@PutMapping(value="/updateAdministrateur/{id}")
	public Administrateur update(@PathVariable(name="id") Long id,@RequestBody Administrateur u) {
	   u.setId(id);
		return admin.save(u);
	}
	@DeleteMapping(value="/deleteAdministrateur/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		admin.deleteById(id);
	}
	
}
