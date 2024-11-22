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
public class User {
	
	@Id
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String firstname;
	private String lastname;
	
	
}
