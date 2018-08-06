package com.app.destiny.dao.Impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.app.destiny.dao.UserDetailsDao;
import com.app.destiny.model.AppUser;

@Repository
public class UserDetailsDaoImpl extends JdbcDaoSupport implements UserDetailsDao
{

	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}

	@Override
	public AppUser getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalUser() {
		System.out.println("getTotalUsergetTotalUsergetTotalUsergetTotalUsergetTotalUser");
		String USERCOUNTSQL="SELECT count(0) FROM users";
		int count=getJdbcTemplate().queryForObject(USERCOUNTSQL, Integer.class);
		return count;
	}
}
