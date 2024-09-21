package com.AppCEs.AppCEs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
	
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.sql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/AppCEs?useTimezone=true&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("thiago@123");
		return dataSource();
				
	}
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.MariaDBDialect");
		adapter.setPrepareConnection(true);
		return adapter;
	}

}
