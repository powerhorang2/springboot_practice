package com.cons.common.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class JpaUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	
	private String name;
}
