package online;

import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDrivedLoading 

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    System.out.println("driver loaded");
		    
		    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		    System.out.println("connection ready");
		}
        catch(ClassNotFoundException c)
		{
    	System.out.println("class not present");
    	
		}
		catch(SQLException e)
		{
			System.out.println("Exception:" );
		}
    
    
	}

}
