package com.bezkoder.springjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bezkoder.springjwt.models.Type;



@CrossOrigin("*")
@RepositoryRestResource
public interface TypeRepository extends JpaRepository<Type, Long> {
	
}
