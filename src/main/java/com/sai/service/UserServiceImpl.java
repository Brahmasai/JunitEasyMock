package com.sai.service;

import com.sai.Dao.UserServiceDao;

public class UserServiceImpl implements UserService {

	private UserServiceDao  userServiceDao;
	
	public void setUserServiceDao(UserServiceDao userServiceDao) {
		this.userServiceDao = userServiceDao;
	}

	public String getNameByid(Integer id) {
	String name =	userServiceDao.findNameByid(id);
    String uname =	name.toUpperCase();
		return uname;
		
	}
}
