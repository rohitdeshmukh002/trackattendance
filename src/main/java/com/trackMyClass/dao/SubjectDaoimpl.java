package com.trackMyClass.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackMyClass.entity.Student;
import com.trackMyClass.entity.Subject;

@Repository
public class SubjectDaoimpl implements SubjectDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public List<Subject> getAllSubject() {

		List<Subject> list = null;

		try {
			Session session = factory.openSession();
			Criteria criteria = session.createCriteria(Subject.class);
			list = criteria.list();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String deleteStudent(long id) {

		try {
			Session session = factory.openSession();
			Subject subject = session.get(Subject.class, id);
			if (subject != null) {
				session.delete(subject);
			}
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "subject deleted successfully..!";
	}

	@Override
	public String addSubject(Subject subject) {
		try {
			Session session = factory.openSession();
			session.save(subject);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Subject added successfully...!";
	}



	@Override
	public String updateStudent(Subject subject) {

		try {
			Session session = factory.openSession();
			session.saveOrUpdate(subject);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Subject updated successfully...!";
	}

	@Override
	public Subject getSubjectByID(long id) {
		Subject subject = null ;
		try {
			Session session = factory.openSession();
			subject = session.get(Subject.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return subject;
	}

}
