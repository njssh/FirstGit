package com.njs.demo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.njs.demo.bean.User;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public int count() {
		return this.getSqlSession().selectOne("ATOM-USER.count");
	}
	
	@Override
	public User getUser(User user) {
		List l = this.getSqlSession().selectList("ATOM-USER.findUserByNameAndPassword", user);
		return (User) l.get(0);
	}

	@Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
