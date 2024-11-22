package com.trackMyClass.dao;

import java.util.List;

import com.trackMyClass.entity.Student;
import com.trackMyClass.entity.Subject;

public interface SubjectDao {

	public List<Subject> getAllSubject();
	
	public String addSubject(Subject subject);
	
	public Subject getSubjectByID(long id);
	
	public String updateStudent(Subject subject);
	
	public String deleteStudent(long id);
}
