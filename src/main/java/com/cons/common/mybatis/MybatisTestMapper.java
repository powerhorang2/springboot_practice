package com.cons.common.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MybatisTestMapper {
	List<Map<String, Object>> getTest();
}
