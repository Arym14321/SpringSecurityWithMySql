package com.kd.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/secured/rest")
public class WebSecurityController {
	 @GetMapping("/load")
	public String loadController() {
		 System.out.println("controller");
		return "Load Controller Success";
	}
	 @GetMapping("/not-secure")
		public String notSecurity() {
			 System.out.println("controller");
			return "Load Controller Success";
		}

}
