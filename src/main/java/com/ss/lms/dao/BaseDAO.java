package com.ss.lms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class BaseDAO<T> {

	@Autowired
	JdbcTemplate mySqlTemplate;

}