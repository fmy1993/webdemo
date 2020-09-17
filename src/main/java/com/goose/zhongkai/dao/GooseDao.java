package com.goose.zhongkai.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.goose.zhongkai.entity.Goose;
import com.goose.zhongkai.entity.Page;
import com.goose.zhongkai.mapper.GooseRowMapper;
import com.goose.zhongkai.service.IGooseService;
import com.goose.zhongkai.service.IPageService;

@Repository
public class GooseDao implements IGooseDAO {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Autowired		
	private IPageService Ipageservice;
	private Page page;
	final int PAGESIZE=10;
	@Override	
	public List<Goose> getAllGoose(int pageNum,int pageSize) {//to do,分页
		String sql="select id,neckringid,eggarea,eggamount,ideletetag from goose where ideletetag=0 order by id limit "+pageNum+","+pageSize;
		//RowMapper<Goose> rowmapper = new BeanPropertyRowMapper<Goose>(Goose.class);//得到一个单行的容器
		RowMapper<Goose> rowMapper = new GooseRowMapper();
		List<Goose> goose = jdbctemplate.query(sql,rowMapper);// TODO Auto-generated method 
		page=Ipageservice.initPage(PAGESIZE);
		for(Goose goose_item:goose)
			goose_item.setPage(page);						
		return goose;
	}

	@Override
	public void addGoose(Goose goose) {
		String sql="INSERT INTO `goose` ( `neckringid`, `eggarea`, `eggamount`) VALUES(?,?,?) ";
		jdbctemplate.update(sql,goose.getNeckringid(),goose.getEggarea(),goose.getEggamount());
	}

	@Override
	public void updateGoose(Goose goose) {
		String sql="update goose set neckringid=?,eggamount=?,eggamount=? where id=? and ideletetag=0";
		jdbctemplate.update(sql, goose.getNeckringid(),goose.getEggarea(),goose.getEggamount(),goose.getId());
	}

	@Override
	public void deleteGoose(int Id) {
		String sql="update goose set ideletetag=1 where id=?";
		jdbctemplate.update(sql, Id);

	}

	@Override
	public Goose getGooseByid(int gooseid) {
		String sql="select id,neckringid,eggarea,eggamount from goose where id=? and ideletetag=0";
		RowMapper<Goose> rowmapper = new BeanPropertyRowMapper<Goose>(Goose.class);//得到一个单行的容器
		Goose goose = jdbctemplate.queryForObject(sql,rowmapper,gooseid);
		return goose;
	}

}
