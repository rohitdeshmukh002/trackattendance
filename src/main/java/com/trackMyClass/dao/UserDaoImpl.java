package com.trackMyClass.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackMyClass.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory factory;
	private List<User> list = null;
	

	@Override
	public List<User> getAllUser() {

		try {
			Session session =factory.openSession();
			Criteria criteria = session.createCriteria(User.class);
			list = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String insertUser(User user) {

		try {
			Session session =factory.openSession();
			session.save(user);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "user added successfully...!";
	}

	@Override
	public User getUserbyId(String username) {
			
		User user = null;
		try {
			Session session =factory.openSession();
			user = session.get(User.class, username);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public String updateUser(User user) {

		try {
			Session session =factory.openSession();
			session.saveOrUpdate(user);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "user updated successfully..!";
	}

	@Override
	public String deleteUser(String username) {

		try {
			Session session =factory.openSession();
			User user = session.get(User.class, username);
			if (user != null) {
				session.delete(user);
			}
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "user deleted successfully..!";
	}

}
