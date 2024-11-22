package com.trackMyClass.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Component

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AttendanceDto {

		private String id;
		private List<Long> rollno;
		private String username;
		private int sid;
		private String date ;
		private String time;
		private int counts;		
		
}
