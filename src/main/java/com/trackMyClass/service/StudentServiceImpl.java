package com.trackMyClass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackMyClass.dao.StudentDao;
import com.trackMyClass.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public String insertStudent(Student student) {
		
		return dao.insertStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return dao.getAllStudent();
	}

	@Override
	public List<Student> getStudentbyId(long rollno) {
		
		return dao.getStudentbyId(rollno);
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudent(student);
	}

	@Override
	public String deleteStudent(long rollno) {
		// TODO Auto-generated method stub
		return dao.deleteStudent(rollno);
	}

	@Override
	public List<Student> getStudentbyIds(List<Long> rollno) {
		
		return dao.getStudentbyIds(rollno);
	}

}
