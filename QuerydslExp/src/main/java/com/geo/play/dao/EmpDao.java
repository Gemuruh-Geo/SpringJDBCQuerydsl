package com.geo.play.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.query.QueryDslJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.geo.play.mapper.EmployeeMapper;
import com.geo.play.model.Employee;
import com.geo.play.model.QEmployee;
import com.mysema.query.sql.SQLQuery;



@Repository
public class EmpDao implements IEmpDao{

	private QueryDslJdbcTemplate jdbcTemplate;
	
	private final QEmployee qEmployee = QEmployee.employee;
	
	
	@Autowired
	private DataSource mysqlds;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
//		String sql = "select id, firstname,lastname, case when role=1 then 'admin' "
//				+ "when role = 2 then 'reguler' "
//				+ "else 'undefined' end as role "
//				+ "from employee";
//		
		
		jdbcTemplate = new QueryDslJdbcTemplate(mysqlds);
		
		SQLQuery query = jdbcTemplate.newSqlQuery().from(qEmployee);
		List<Employee> empls = jdbcTemplate.query(query, new EmployeeMapper(qEmployee));
		return empls;
	}

}
