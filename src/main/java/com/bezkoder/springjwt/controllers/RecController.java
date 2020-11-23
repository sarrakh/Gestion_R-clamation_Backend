package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
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

import com.bezkoder.springjwt.models.Reclamation;
import com.bezkoder.springjwt.repository.RecRepo;
import com.bezkoder.springjwt.security.services.SendEmailService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class RecController {
	
	@Autowired 
	private RecRepo rec;
	
	@Autowired
	private SendEmailService sendEmailService;
	
	
	@GetMapping(value="/AllReclam")
	public List<Reclamation> listeReclam() {
		return rec.findAll();
	}
	@GetMapping(value="/AllReclam/{id}")
	public Reclamation listeReclam(@PathVariable(name="id") Long id) {
		return rec.findById(id).get();	}
	
	@PostMapping(value="/addReclam")
	public Reclamation save(@Validated  @RequestBody Reclamation u) {
		sendEmailService.sendEmail("adsotetel@gmail.com", "Nouvelle réclamation a été ajouter dans votre système, Vous pouvez le consulter sur votre site web .  ", "Réclamation Systeme Ajoutée");
	    return rec.save(u);
	}
	@PutMapping(value="/updateReclam/{id}")
	public Reclamation update(@PathVariable(name="id") Long id,@RequestBody Reclamation u) {
	   u.setId(id);
		return rec.save(u);
	}
	@DeleteMapping(value="/deleteReclam/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		rec.deleteById(id);
	}
	
}
