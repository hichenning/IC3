package cn.com.service;

import org.springframework.stereotype.Service;

import cn.com.model.User;

@Service
public interface LoginServiceI {
	
	public User query(String name);
	public int save(User user);
}
