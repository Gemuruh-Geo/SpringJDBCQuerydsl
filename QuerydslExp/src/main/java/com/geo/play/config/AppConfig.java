package com.geo.play.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.geo.play.dao.EmpDao;
import com.geo.play.dao.IEmpDao;
import com.geo.play.service.EmpService;
import com.geo.play.service.IEmpService;



@Configuration
@Import(value={DBConfig.class})
@ComponentScan(basePackages={"com.geo.experiment"})
@PropertySource(value={"classpath:conn.properties"})
public class AppConfig {
	@Bean(name="empdao")
	public IEmpDao getEmpDao(){
		return new EmpDao();
	}
	@Bean(name="empservice")
	public IEmpService getEmpService(){
		return new EmpService();
	}
}
