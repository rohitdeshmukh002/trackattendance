package com.trackMyClass.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Attendance {

	@Id
	private String id;
	private String date;
	private String time;
	private int count;

	@ManyToOne
	@JoinColumn(name = "username")
	private User user;

	@ManyToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable
	(name = "attendance_student", 
	joinColumns = @JoinColumn(name = "attendance_id"),
	inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> students;


}
