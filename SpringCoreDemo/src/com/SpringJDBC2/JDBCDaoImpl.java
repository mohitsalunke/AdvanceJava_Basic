package com.SpringJDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCDaoImpl {

	
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_URL ="jdbc:mysql://localhost:3306/shape";
	public static final String USER ="root";
	public static final String PASS ="root";

	
	
	public Circle getCircleById(int inputCircleId)
	{
		Circle circle =null;
		Connection conn =null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 
			System.out.println("Connecting to database");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Creating statement...");
			String sql= "Select * from circle where ID=1";
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			System.out.println(stmt.toString());
			
			while(rs.next())
			{
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				circle =new Circle(id,name);
			}
			
					
		}
		catch (SQLException se)
		{
			se.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				if(rs !=null)
				{
					rs.close();
				}
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			try{
				if(stmt !=null)
				{
					stmt.close();
				}
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			try{
				if(conn !=null)
				{
					conn.close();
					conn=null;
					rs.close();
				}
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		System.out.println("GoodByE");
		
		return circle;
		
		
	}



	
	
}
