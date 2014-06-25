package com.geo.play.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.geo.play.config.AppConfig;
import com.geo.play.model.Employee;
import com.geo.play.service.IEmpService;


public class Main {
	private static ApplicationContext ctx;

	public static void main(String[] args){
		
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IEmpService empservice = (IEmpService) ctx.getBean("empservice");
		
		List<Employee> emps = empservice.getAllEmployee();
		
		System.out.println(emps.get(0).getFirstname());
		
		
	}
}
