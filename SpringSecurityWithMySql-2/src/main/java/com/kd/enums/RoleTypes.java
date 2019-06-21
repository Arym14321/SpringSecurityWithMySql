package com.kd.enums;

import com.kd.modal.Role;

public enum RoleTypes {
	ADMIN(1L,"Admin"),
	NORMAL_ADMIN(2L,"Normal Admin"),
	USER(3L, "USER");
	
	private final Role role;
	
	RoleTypes(Long id, String name){
		this.role = new Role(id,name);
	}
	
}
