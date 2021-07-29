package com.cons.common.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisTestServiceImpl implements MybatisTestService {
	private MybatisTestMapper mybatisTestMapper;
	
	@Autowired
	public MybatisTestServiceImpl(MybatisTestMapper mybatisTestMapper) {
		this.mybatisTestMapper = mybatisTestMapper;
	}
	
	@Override
	public List<Map<String, Object>> getTest() {
		return mybatisTestMapper.getTest();
	}
}
