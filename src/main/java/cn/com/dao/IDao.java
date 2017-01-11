package cn.com.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.model.User;

@Repository
public interface IDao {
	
	List query(Class clazz, Serializable id);
	<T> void save(T t);
	//
	<T> T query(String hql, Collection params);
}
