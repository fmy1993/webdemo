package com.goose.zhongkai.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.goose.zhongkai.entity.Goose;

public class GooseRowMapper implements RowMapper<Goose> {

	@Override
	public Goose mapRow(ResultSet row, int rowNum) throws SQLException {
		Goose goose = new Goose();
		goose.setId(row.getInt("id"));
		goose.setEggarea(row.getString("eggarea"));
		goose.setNeckringid(row.getString("neckringid"));
		goose.setEggamount(row.getInt("eggamount"));
		goose.setIdeletetag(row.getInt("ideletetag"));
		return goose;
	}

}
