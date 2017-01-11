package cn.com.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.com.model.User;

@Service
public interface LoginServiceI {
	
	public List query(Serializable id);
	public void save(User user);
}
