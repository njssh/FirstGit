package com.njs.demo.dao;

import com.njs.demo.bean.User;

public interface UserDao {
    public int count();

	public User getUser(User user);
}
