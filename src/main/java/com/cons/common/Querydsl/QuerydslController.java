package com.cons.common.Querydsl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/dsl")
public class QuerydslController {
	private QuerydslRepository querydslRepository;
	private QuerydslRepositorySupportMy querydslRepositorySupportMy;
	
	@GetMapping("/name")
	public void QuerydslNameTest() {
		String name = "test";
		querydslRepository.save(new QuerydslTest(name));
		List<QuerydslTest> list = querydslRepositorySupportMy.findByName(name);
		
		list.forEach(querydslTest -> System.out.println(querydslTest.getName()));
	}
}
