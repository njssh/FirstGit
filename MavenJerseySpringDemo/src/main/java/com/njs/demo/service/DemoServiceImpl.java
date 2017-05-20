package com.njs.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.njs.demo.bean.User;
import com.njs.demo.dao.UserDao;

@Transactional
@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	UserDao userDao;

	public String say() {
		return "Hello Jersey";
	}

	public User getUserXml() {
		User user = new User();
		user.setAge("21");
		user.setUserId("004");
		user.setUserName("wang4");
		User u1 = userDao.getUser(user);
		return u1;
	}
}
