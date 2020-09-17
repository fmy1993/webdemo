package com.goose.zhongkai.service;

import java.util.List;

import com.goose.zhongkai.entity.Goose;

public interface IGooseService {
	List<Goose> getAllGoose(int pageNum,int pageSize);
	Goose getGooseByid(int id);
	void addGoose(Goose goose);
	void updateGoose(Goose goose);
	void deleteGoose(int Id);
	
}
