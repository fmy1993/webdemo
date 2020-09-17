package com.goose.zhongkai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.goose.zhongkai.dao.IGooseDAO;
import com.goose.zhongkai.entity.Goose;


/**
 * @author fmy
 * service call dao interface to run DAO logic
 */
@Service
public class GooseService implements IGooseService {
	@Autowired
	private IGooseDAO goosedao;

	@Override
	public List<Goose> getAllGoose(int pageNum,int pageSize) {
		
		return goosedao.getAllGoose(pageNum,pageSize);
	}

	@Override
	public Goose getGooseByid(int id) {		
		return goosedao.getGooseByid(id);
	}

	@Override
	public void addGoose(Goose goose) {
		goosedao.addGoose(goose);
	}

	@Override
	public void updateGoose(Goose goose) {
		goosedao.updateGoose(goose);
	}

	@Override
	public void deleteGoose(int Id) {
		goosedao.deleteGoose(Id);
	}
}
