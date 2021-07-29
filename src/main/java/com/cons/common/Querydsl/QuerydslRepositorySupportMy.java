package com.cons.common.Querydsl;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.cons.common.Querydsl.QQuerydslTest.querydslTest;

@Repository
public class QuerydslRepositorySupportMy extends QuerydslRepositorySupport {
	private final JPAQueryFactory jpaQueryFactory;

	public QuerydslRepositorySupportMy(JPAQueryFactory jpaQueryFactory) {
		super(QuerydslTest.class);
		this.jpaQueryFactory = jpaQueryFactory;
	}

	public List<QuerydslTest> findByName(String name) {
		return jpaQueryFactory
				.selectFrom(querydslTest)
				.where(querydslTest.name.eq(name))
				.fetch();
	}
}
