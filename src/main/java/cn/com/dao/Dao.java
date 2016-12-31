package cn.com.dao;

import java.util.List;

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

	public User query() {
		Query query = getSession().createQuery("FROM User");
		List<User> users = query.list();
		User user = null;
		if (!users.isEmpty()) {
			user = users.get(0);
		}
		return user;
	}

}
