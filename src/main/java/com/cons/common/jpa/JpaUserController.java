package com.cons.common.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class JpaUserController {

	private JpaUserService jpaUserService;
	
	@Autowired
	public JpaUserController(JpaUserService jpaUserService) {
		this.jpaUserService = jpaUserService;
	}
	
	@PostMapping("/signup")
	public JpaUser signup(@RequestBody JpaUser jpaUser) {
		JpaUser jpaUserResult = jpaUserService.signup(jpaUser);
		return jpaUserResult;
	}
}
