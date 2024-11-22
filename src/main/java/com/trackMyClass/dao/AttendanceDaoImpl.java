package com.trackMyClass.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trackMyClass.entity.Attendance;
import com.trackMyClass.model.AttendanceDto;

@Repository
public class AttendanceDaoImpl implements AttendanceDao {
	
	@Autowired
	SessionFactory factory;
	
	@Override
	public String takeAttendance(Attendance attendance) {
		
		
		try {
			Session session = factory.openSession();
			session.save(attendance);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "data inserted successfully..!";
	}

}
