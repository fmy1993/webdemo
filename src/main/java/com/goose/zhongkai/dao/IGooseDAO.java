package com.goose.zhongkai.dao;

import java.util.List;

import com.goose.zhongkai.entity.Goose;

public interface IGooseDAO {
	List<Goose> getAllGoose(int pageNum,int pageSize) ;
	void addGoose(Goose goose);
	void updateGoose(Goose goose);
	void deleteGoose(int Id);
	Goose getGooseByid(int gooseid);
}
