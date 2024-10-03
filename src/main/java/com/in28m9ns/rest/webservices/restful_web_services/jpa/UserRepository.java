package com.in28m9ns.rest.webservices.restful_web_services.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28m9ns.rest.webservices.restful_web_services.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

}
