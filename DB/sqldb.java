package org.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sqldb {
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			// 1.load the driver
			Class.forName("oracle.jdbc.OracleDriver");
			// 2.connect to db
			 con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","hr","prem");
			//3.write sql query
			String sql ="select * from Employees";
			//4.prepare the st
			PreparedStatement ps = con.prepareStatement(sql);
			//5.execute the query
			ResultSet rs = ps.executeQuery();
			//6.itreate the query
			while (rs.next()) {
				//user name 
				String firstname = rs.getString("FIRST_NAME");
				//password
				String lastname = rs.getString("LAST_NAME");
				System.out.println(firstname);
				System.out.println(lastname);
			}
			//7.close db connection
			;		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
