package cn.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.dao.Dao;
import cn.com.dao.IDao;
import cn.com.model.User;
import cn.com.utils.Encode;

@Service
public class LoginService implements LoginServiceI{
	
	@Autowired
	private IDao dao;
	
	public User query(String name){
		User user = dao.query();
		user.setPassword(Encode.encode(user.getPassword()));
		return user;
	}
	
}