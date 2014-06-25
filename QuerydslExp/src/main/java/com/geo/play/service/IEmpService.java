package com.geo.play.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geo.play.model.Employee;



@Service
@Transactional
public interface IEmpService {
	public List<Employee> getAllEmployee();
}
