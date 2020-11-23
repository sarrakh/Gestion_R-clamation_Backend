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

import com.bezkoder.springjwt.models.Technicien;
import com.bezkoder.springjwt.repository.TechRepo;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class TechController {
	@Autowired 
	private TechRepo tech;
	
	@GetMapping(value="/Alltech")
	public List<Technicien> listetech() {
		return tech.findAll();
	}
	@GetMapping(value="/Alltech/{id}")
	public Technicien listetech(@PathVariable(name="id") Long id) {
		return tech.findById(id).get();	}
	
	@PostMapping(value="/addtech")
	public Technicien save(@Validated  @RequestBody Technicien u) {
	    return tech.save(u);
	}
	@PutMapping(value="/updatetech/{id}")
	public Technicien update(@PathVariable(name="id") Long id,@RequestBody Technicien u) {
	   u.setId(id);
		return tech.save(u);
	}
	@DeleteMapping(value="/deletetech/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		tech.deleteById(id);
	}
	
}
