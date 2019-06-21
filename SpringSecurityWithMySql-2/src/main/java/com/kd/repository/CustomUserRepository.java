package com.kd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kd.entity.UserEntity;

public interface CustomUserRepository extends JpaRepository<UserEntity, Integer>{
	
	public UserEntity findByEmail(String email);
}
