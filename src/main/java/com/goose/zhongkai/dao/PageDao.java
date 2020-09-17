package com.goose.zhongkai.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PageDao implements IPageDAO {

	@Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public int getDataNum() {
		String sql="select count(1) from goose where ideletetag=0";
		//int temp=jdbctemplate.queryForObject(sql, Integer.class);
		return jdbctemplate.queryForObject(sql, Integer.class);
		
		
	}

}
