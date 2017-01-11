package cn.com.service;

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
	public User query(String name){
		User user = dao.query();
		user.setPassword(Encode.encode(user.getPassword()));
		return user;
	}

	@Transactional(value=TxType.REQUIRED)
	public int save(User user) {
		dao.save(user);
		//System.out.println(1/0);
		return 0;
	}
	
}
