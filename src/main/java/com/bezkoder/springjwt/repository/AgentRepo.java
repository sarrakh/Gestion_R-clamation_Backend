package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bezkoder.springjwt.models.Agent;



@CrossOrigin("*")
@RepositoryRestResource
public interface AgentRepo  extends JpaRepository<Agent, Long>{

}
