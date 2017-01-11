package cn.com.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.model.User;

@Repository
public class Dao implements IDao{

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	//	return sessionFactory.openSession();
	}

	public List query(Class entiryclass, Serializable id ) {
		Criteria criteria = getSession().createCriteria(entiryclass);
		List<User> users = criteria.list();
		return users;
	}

	@Override
	public <T> void save(T t) {
		getSession().save(t);
		//throw new RuntimeException("");
	}

	@Override
	public <T> T query(String hql, Collection params) {
		Query query = getSession().createQuery("FROM User");
		List<User> users = query.list();
		User user = null;
		if (!users.isEmpty()) {
			user = users.get(0);
		}
		return (T) user;

	}

}
