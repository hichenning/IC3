package cn.com.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

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
	
	@Transactional(value=TxType.REQUIRED)
	public User query(){
		User user = dao.query("FROM user",null);
		user.setPassword(Encode.encode(user.getPassword()));
		return user;
	}

	@Transactional(value=TxType.REQUIRED)
	public void save(User user) {
		dao.save(user);
	}

	@Override
	public List query(Serializable id) {
		return dao.query(User.class, id);
	}
	
}
