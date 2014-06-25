package com.geo.play.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.geo.play.model.Employee;
import com.geo.play.model.QEmployee;
import com.mysema.query.Tuple;
import com.mysema.query.types.Expression;
import com.mysema.query.types.MappingProjection;

public class EmployeeMapper extends MappingProjection<Employee> {
	private QEmployee qEmployee;
	public EmployeeMapper(QEmployee qEmployee) {
		
		super(Employee.class,qEmployee.firstname,qEmployee.id,qEmployee.lastname,qEmployee.role);
		// TODO Auto-generated constructor stub
		this.qEmployee = qEmployee;
	}

	@Override
	protected Employee map(Tuple arg0) {
		Employee employee = new Employee();

		employee.setId(arg0.get(qEmployee.id));
		employee.setFirstname(arg0.get(qEmployee.firstname));
        employee.setLastname(arg0.get(qEmployee.lastname));
        employee.setRole(arg0.get(qEmployee.role));

        return employee;
	}
	
}
