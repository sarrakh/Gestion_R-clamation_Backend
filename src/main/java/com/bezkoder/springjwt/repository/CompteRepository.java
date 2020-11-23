package com.bezkoder.springjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
	Optional<Compte> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
