package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		String url ="jdbc:mysql://localhost:3306/hb_student_tracker";
		String uname ="hbstudent";
		String pwd ="hbstudent";
		Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,uname,pwd);
	Statement st = con.createStatement();
	System.out.println(con.toString());

	}

}
