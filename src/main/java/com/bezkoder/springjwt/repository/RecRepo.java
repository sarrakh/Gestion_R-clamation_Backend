package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bezkoder.springjwt.models.Reclamation;



@CrossOrigin("*")
@RepositoryRestResource
public interface RecRepo extends JpaRepository<Reclamation,Long> {

}
