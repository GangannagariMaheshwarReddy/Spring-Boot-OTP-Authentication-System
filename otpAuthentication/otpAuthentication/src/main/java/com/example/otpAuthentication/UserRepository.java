package com.example.otpAuthentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Appuser, Integer> {
	
	Appuser findByName(String name);
}
