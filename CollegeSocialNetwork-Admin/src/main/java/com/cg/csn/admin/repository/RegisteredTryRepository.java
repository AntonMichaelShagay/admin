package com.cg.csn.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.csn.admin.entity.RegisteredTry;

public interface RegisteredTryRepository extends JpaRepository<RegisteredTry, Long> {
	 
    RegisteredTry findByUsernameAndPasswordAndRole(String username, String password, String role);
 
}