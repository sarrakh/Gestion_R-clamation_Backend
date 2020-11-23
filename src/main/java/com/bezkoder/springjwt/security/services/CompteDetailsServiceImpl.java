package com.bezkoder.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.models.Compte;
import com.bezkoder.springjwt.repository.CompteRepository;

@Service
public class CompteDetailsServiceImpl implements UserDetailsService {
	@Autowired
	CompteRepository compteRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Compte Compte = compteRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		return CompteDetailsImpl.build(Compte);
	}

}
