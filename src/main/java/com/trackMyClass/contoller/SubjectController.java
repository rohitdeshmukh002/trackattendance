package com.trackMyClass.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.trackMyClass.entity.Subject;
import com.trackMyClass.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService service;
	
	@GetMapping("/get-all-subjects")
	public List<Subject> getAllSubject() {
		return service.getAllSubject();
	}
	
	@PostMapping("/add-subject")
	public String addSubject(@RequestBody Subject subject) {
		return service.addSubject(subject);
	}
	
	@GetMapping("/get-subject-by-id/{id}")
	public Subject getSubjectByID(@PathVariable long id) {
		return service.getSubjectByID(id);
	}
	
	@PutMapping("/update-subject")
	public String updateStudent(@RequestBody Subject subject) {
		return service.updateStudent(subject);
	}
	
	@DeleteMapping("/delete-subject/{id}")
	public String deleteStudent(@PathVariable long id) {
		return service.deleteStudent(id);
	}
	}
	

