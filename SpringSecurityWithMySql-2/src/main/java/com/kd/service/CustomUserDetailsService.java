package com.kd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kd.entity.UserEntity;
import com.kd.modal.CustomUserDetails;
import com.kd.repository.CustomUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomUserRepository CustomUserRepository;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		UserEntity userEntity = CustomUserRepository.findByEmail(userName);
		if(userEntity == null)
			throw new UsernameNotFoundException("User Not Found");
		return new CustomUserDetails(userEntity);
	}

}
