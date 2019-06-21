package com.kd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kd.enums.RoleTypes;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {
	public UserEntity() {

	}
	public UserEntity(UserEntity userEntity) {
		this.id = userEntity.getId();
		this.email = userEntity.getEmail();
		this.firstName = userEntity.getFirstName();
		this.lastName = userEntity.getLastName();
		this.password = userEntity.getPassword();
		this.roles = userEntity.getRoles();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@Column(name="first_name", nullable = true)
	private String firstName;
	
	@Column(name="last_name", nullable = true)
	private String lastName;
	
	@Column(name="password", nullable = true)
	private String password;
	
	@Column(name="roles", nullable = true)
	private String roles;


}
