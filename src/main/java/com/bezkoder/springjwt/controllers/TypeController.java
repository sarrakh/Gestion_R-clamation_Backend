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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Type;
import com.bezkoder.springjwt.repository.TypeRepository;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class TypeController {
	
	@Autowired 
	private TypeRepository type;
	
	@GetMapping(value="/AllType")
	public List<Type> listeType() {
		return type.findAll();
	}
	@GetMapping(value="/AllType/{id}")
	public Type listeType(@PathVariable(name="id") Long id) {
		return type.findById(id).get();	}


	@PostMapping(value="/addType")
	public Type save(@Validated  @RequestBody Type u) {
	    return type.save(u);
	}
	@PutMapping(value="/updateType/{id}")
	public Type update(@PathVariable(name="id") Long id,@RequestBody Type u) {
	   u.setId(id);
		return type.save(u);
	}
	@DeleteMapping(value="/deleteType/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		type.deleteById(id);
	}
	
}
