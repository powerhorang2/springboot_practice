package com.cons.common.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaUserService {
	
	private JpaUserRepository jpaUserRepository;
	
	@Autowired
	public JpaUserService(JpaUserRepository jpaUserRepository) {
		this.jpaUserRepository = jpaUserRepository;
	}
	
	public JpaUser signup(JpaUser jpaUser) {
		JpaUser jpaUserResult = jpaUserRepository.save(jpaUser);
		return jpaUserResult;
	}
}
