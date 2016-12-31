package cn.com.dao;

import org.springframework.stereotype.Repository;

import cn.com.model.User;

@Repository
public interface IDao {
	public User query();
}
