package com.cons.common.Querydsl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

/**
 * Project : base
 * Create by Spring Tool Suite 4 IDEA
 * User : powerhorang2
 * Date : 2021-07-28
 * Time: 오후 04:53
 */

@Configuration
public class QuerydslConfig {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Bean
	public JPAQueryFactory jpaQueryFactory() {
		return new JPAQueryFactory(entityManager);
	}
}
