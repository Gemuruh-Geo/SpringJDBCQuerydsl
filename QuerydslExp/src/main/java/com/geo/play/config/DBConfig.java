package com.geo.play.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DBConfig {
	
	
	private static final String URL = "db.url.my";
	private static final String DRIVER = "db.driver.my";
	private static final String USER = "db.username.my";
	private static final String PASSWORD = "db.password.my";
	
	@Resource
	Environment env;
	
	
	@Bean(name={"mysqlds"})
	public DataSource mySqlDataSource(){
		DriverManagerDataSource dmDataSource = new DriverManagerDataSource();
		dmDataSource.setDriverClassName(env.getRequiredProperty(DRIVER));
		dmDataSource.setUrl(env.getRequiredProperty(URL));
		dmDataSource.setUsername(env.getRequiredProperty(USER));
		dmDataSource.setPassword(env.getRequiredProperty(PASSWORD));
		return dmDataSource;
	}
}
