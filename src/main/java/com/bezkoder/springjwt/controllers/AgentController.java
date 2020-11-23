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

import com.bezkoder.springjwt.models.Agent;
import com.bezkoder.springjwt.repository.AgentRepo;





@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class AgentController {
	@Autowired 
	private AgentRepo agent;
	
	@GetMapping(value="/AllAgent")
	public List<Agent> listeAgent() {
		return agent.findAll();
	}
	@GetMapping(value="/AllAgent/{id}")
	public Agent listeAgent(@PathVariable(name="id") Long id) {
		return agent.findById(id).get();	}
	
	@PostMapping(value="/addAgent")
	public Agent save(@Validated  @RequestBody Agent u) {
	    return agent.save(u);
	}
	@PutMapping(value="/updateAgent/{id}")
	public Agent update(@PathVariable(name="id") Long id,@RequestBody Agent u) {
	   u.setId(id);
		return agent.save(u);
	}
	@DeleteMapping(value="/deleteAgent/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		agent.deleteById(id);
	}
	
}
