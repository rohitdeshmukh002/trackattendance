package com.trackMyClass.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	
	@Id
	private long rollno;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String phonenumber;
	private String address;
	private String studentid;
	private String department;
	private String classname;
	
	
}
