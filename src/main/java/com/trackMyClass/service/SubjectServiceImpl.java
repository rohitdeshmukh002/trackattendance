package com.trackMyClass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackMyClass.dao.SubjectDao;
import com.trackMyClass.entity.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private SubjectDao dao;

	@Override
	public List<Subject> getAllSubject() {
		return dao.getAllSubject();
	}

	@Override
	public String addSubject(Subject subject) {
		return dao.addSubject(subject);
	}

	@Override
	public Subject getSubjectByID(long id) {
		return dao.getSubjectByID(id);
	}

	@Override
	public String updateStudent(Subject subject) {
		return dao.updateStudent(subject);
	}

	@Override
	public String deleteStudent(long id) {
		return dao.deleteStudent(id);
	}




}
