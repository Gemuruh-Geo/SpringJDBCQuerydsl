package com.geo.play.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geo.play.dao.IEmpDao;
import com.geo.play.model.Employee;


@Service
@Transactional
public class EmpService implements IEmpService{
	
	@Autowired
	IEmpDao empdao;
	

	@Override
	public List<Employee> getAllEmployee() {
		
		return empdao.getAllEmployee();
	}

}
