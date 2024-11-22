package com.trackMyClass.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackMyClass.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public String insertStudent(Student student) {
		
		try {
			Session session = factory.openSession();
			session.save(student);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Student Added Successfully...!";
	}

	@Override
	public List<Student> getAllStudent() {
			
		
		List<Student> list2 = null ;
		
		try {
			Session session = factory.openSession();
			Criteria criteria = session.createCriteria(Student.class);
			list2 = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list2;
		
	}

	@Override
	public List<Student> getStudentbyId(long rollno) {
		
		List<Student> list = null;
		
		try {
			Session session = factory.openSession();
			Criteria criteria = session.createCriteria(Student.class);
			criteria.add(Restrictions.eq("rollno", rollno));
			list = criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String updateStudent(Student student) {
		
		Session session = factory.openSession();
		
		try {
			session.saveOrUpdate(student);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "student updated Successfully...!";
	}

	@Override
	public String deleteStudent(long rollno) {
			
		
		try {
			Session session = factory.openSession();
			Student student =session.get(Student.class, rollno);
			if(student != null) {
				session.delete(student);
			}
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "data deleted successfully..!";
	}

	@Override
	public List<Student> getStudentbyIds(List<Long> rollno) {
		
		List<Student> list = null;
		try {
			Session session = factory.openSession();
			list =session.byMultipleIds(Student.class).multiLoad(rollno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
