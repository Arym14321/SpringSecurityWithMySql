package com.kd.modal;

import lombok.Data;

@Data
public class Role {
	private Long id;
	private String role;

	public Role(Long id,String role){
		this.id = id;
		this.role = role;
	}
}
