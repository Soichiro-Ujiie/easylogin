package com.example.easylogin.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easylogin.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<org.springframework.boot.autoconfigure.security.SecurityProperties.User> findByUserNameAndPassword(String userName, String password);
	

}
