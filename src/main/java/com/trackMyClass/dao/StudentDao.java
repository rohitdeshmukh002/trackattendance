package com.trackMyClass.dao;

import java.util.List;

import com.trackMyClass.entity.Student;

public interface StudentDao {
	
public String insertStudent (Student student);
	
	public List<Student> getAllStudent();
	
	public List<Student> getStudentbyId(long rollno);
	
	public String updateStudent(Student student);
	
	public String deleteStudent(long rollno);

	public List<Student> getStudentbyIds(List<Long> rollno);
	
}
