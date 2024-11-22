package com.trackMyClass.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trackMyClass.model.AttendanceDto;
import com.trackMyClass.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
	
	@Autowired
	private AttendanceService service;
	
	
	@PostMapping("/take-attendance")
	public String takeAttendance(@RequestBody AttendanceDto attendanceDto) {
		
		return service.takeAttendance(attendanceDto);
	}
	
}
