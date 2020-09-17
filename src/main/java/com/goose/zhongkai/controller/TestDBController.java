package com.goose.zhongkai.controller;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDBController {
	
	@Autowired
	DataSource dataSource;
	
	@Test
	@ResponseBody
	@RequestMapping("/testdb")
	void contextLoads() throws Exception{
		System.out.println("获取的数据库连接为:"+dataSource.getConnection());
	}
}
