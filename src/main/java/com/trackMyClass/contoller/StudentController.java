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

import com.trackMyClass.entity.Student;
import com.trackMyClass.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/get-all-students")
	public List<Student> getAllStudent() {

		return service.getAllStudent();
	}

	@PostMapping("/add-student")
	public String insertStudent(@RequestBody Student student) {

		return service.insertStudent(student);
	}

	@GetMapping("/get-student-by-id/{rollno}")
	public List<Student> getStudentbyId(@PathVariable long rollno) {

		return service.getStudentbyId(rollno);
	}

	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student student) {

		return service.updateStudent(student);
	}

	@DeleteMapping("/delete-student/{rollno}")
	public String deleteStudent(@PathVariable long rollno) {

		return service.deleteStudent(rollno);
	}

}
