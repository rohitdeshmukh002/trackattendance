package com.trackMyClass.aop;

import java.text.SimpleDateFormat;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.trackMyClass.TrackMyClassApplication;

@Component
@Aspect
public class TrackAttendance {
	
	static Logger logger = LoggerFactory.getLogger(TrackMyClassApplication.class);

	@Pointcut("execution( * com.trackMyClass.contoller.*.*(..))")
	public void m1() {
		
	}
	
	@Before("m1()")
	public void starttime() {
		
		String time = new SimpleDateFormat("yy/MM/dd/HH:mm:ss:SSS").format(new java.util.Date());
		logger.info("execution started time" +time);
	}
	
	@After("m1()")
	public void executetime() {
		
		String time = new SimpleDateFormat("yy/MM/dd/HH:mm:ss:SSS").format(new java.util.Date());
		logger.info("execution started time" +time);
	}
}
