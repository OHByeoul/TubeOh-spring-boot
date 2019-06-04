package com.stream.tubeoh.login;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stream.tubeoh.dto.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long>{

	Optional<User> findById(String id);

	
	
}
