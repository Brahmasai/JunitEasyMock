package com.sai.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.sai.Dao.UserServiceDao;

public class UserServiceTest {

	@Test
	public void testGetNameById() {
	UserServiceDao proxy =	EasyMock.createMock(UserServiceDao.class);
		EasyMock.expect(proxy.findNameByid(101)).andReturn("Shiva");
		EasyMock.replay(proxy);
		UserServiceImpl serviceImpl = new UserServiceImpl();
		serviceImpl.setUserServiceDao(proxy);
		String name = serviceImpl.getNameByid(101);
		assertNotNull(name);
		}
}
