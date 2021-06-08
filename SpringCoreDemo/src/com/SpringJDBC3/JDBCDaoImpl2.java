package com.SpringJDBC3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;


@Repository
public class JDBCDaoImpl2 {


	@Autowired
	DataSource dataSource;
	
	private JdbcTemplate jdbctemplate = new JdbcTemplate();
	
	@Autowired
	public void setDataSource(DataSource dataSource)
	{
		this.jdbctemplate=new JdbcTemplate(dataSource);
		this.dataSource=dataSource;
	}
	public int getCircleCount()
	{
		
		
			System.out.println("Creating statement...");
			String sql= "Select count(*) from circle";
			int count=jdbctemplate.queryForObject(sql, null,Integer.class);
		
		return count;
		
		
	}
	
	public String getCircleName(int circleid)
	{
		System.out.println("creating statement..");
		String sql= "select name from circle where id=?";
		return  jdbctemplate.queryForObject(sql, new Object[] {circleid}, String.class);
	}
	
	public void insertCircleObj(Circle2 circle)
	{
		System.out.println("creating statement..");
		String sql= "insert into circle (id,name) value(?,?)";
		 jdbctemplate.update(sql, new Object[] {circle.getId(),circle.getName()});
	}
	
	public void createTriangleTable()
	{
		String sql="create table 'triangle'('tid' int ,'tname' varchar(25)" +"primary key('tid')";
		jdbctemplate.execute(sql);
	}
	
	//For getting one row only from table
	public Circle2 getCircleObject(int circleId)
	{
		String sql="select * from circle where id= ?";
		return jdbctemplate.queryForObject(sql, new Object[] {circleId}, new CircleMapper());
	}
	
	public static final class CircleMapper implements RowMapper<Circle2>
	{

		@Override
		public Circle2 mapRow(ResultSet rs, int rowNum) throws SQLException {
			Circle2 circle= new Circle2(rs.getInt("id"),rs.getString("name"));
			return circle;
		}
		
	}
	
	//for getting whole row at atime from objet, we just change  queryforobject to query
	public List<Circle2> getCircleObjectList()
	{
		String sql="select * from circle";
		return jdbctemplate.query(sql, new CircleMapper());
		
	}
	
	public List<Circle2> getAllCircleObjectUsingResultSetExtractor()
	{
		String sql="Select * from circle";
		return jdbctemplate.query(sql, new ResultSetExtractor<List<Circle2>>()
				{
			

					@Override
					public List<Circle2> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<Circle2> list = new ArrayList<Circle2>();
						while(rs.next())
						{
							Circle2 circle=new Circle2(rs.getInt("id"),rs.getString("name"));
							list.add(circle);
						}
						return list;
					}
			
				});
	}

			
	}

