package com.trackMyClass.service;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackMyClass.dao.AttendanceDao;
import com.trackMyClass.entity.Attendance;
import com.trackMyClass.entity.User;
import com.trackMyClass.model.AttendanceDto;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	
	@Autowired
	private SubjectService subjectservice;
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private StudentService studentservice;
	
	@Autowired 
	private AttendanceDao dao;
	
	@Override
	public String takeAttendance(AttendanceDto attendanceDto) {
		System.out.println(attendanceDto);
		String id = new SimpleDateFormat("yyMMddHHmmssSSS").format(new java.util.Date());
		attendanceDto.setId(id);;
		
		Attendance attendance = new Attendance();
		attendance.setId(id);
		attendance.setDate(attendanceDto.getDate());
		attendance.setTime(attendanceDto.getTime());
		attendance.setCount(attendanceDto.getCounts());
		
		
		attendance.setSubject(subjectservice.getSubjectByID(attendanceDto.getSid()));
		attendance.setStudents(studentservice.getStudentbyIds(attendanceDto.getRollno()));
		attendance.setUser(userservice.getUserbyId(attendanceDto.getUsername()));
		
		System.out.println(attendance);
		
		
		
		return dao.takeAttendance(attendance);
	}

}
