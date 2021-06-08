package com.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {

	private JdbcTemplate jdbctemplate;

	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public int saveStudent(Student s)
	{
		String pquery="insert into Student(sname,email,qualification,exp) values(?,?,?,?)";
		return jdbctemplate.update(pquery,s.getSname(), s.getEmail(), s.getQualification(), s.getExp());
	}
	
}
