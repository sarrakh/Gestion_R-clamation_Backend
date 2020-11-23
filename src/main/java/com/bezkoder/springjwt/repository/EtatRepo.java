package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bezkoder.springjwt.models.Etat;



@CrossOrigin("*")
@RepositoryRestResource
public interface EtatRepo extends JpaRepository<Etat, Long>{

}
