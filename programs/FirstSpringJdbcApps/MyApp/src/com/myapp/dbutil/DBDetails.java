package com.myapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDetails {

	public static Connection getConnection(){
		Connection con=null;
		
		try{
			// register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userName="class5am";
			String password="class5am";
			con= DriverManager.getConnection(url, userName, password);
		}
		catch(ClassNotFoundException classNotFoundException){
			System.out.println(classNotFoundException.toString());
		}
		catch (SQLException sQLException) {
			System.out.println(sQLException.toString());
		}
		
		
		return con;
	}
	/*public static void main(String[] args) {
		Connection con=getConnection();
		if(con!=null)
			System.out.println("successfully connection established::");
		else
			System.out.println("try again...");
	}*/
}
