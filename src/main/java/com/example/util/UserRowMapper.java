package com.example.util;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.example.bean.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setUserId(rs.getInt("userId"));
		user.setPassword(rs.getString("password"));
		user.setUsername(rs.getString("userName"));
		return user;
		
	}

}
