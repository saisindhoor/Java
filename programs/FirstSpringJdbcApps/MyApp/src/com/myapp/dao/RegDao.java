package com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.myapp.dbutil.DBDetails;
import com.myapp.model.RegBO;

public class RegDao {

	public int saveUserDetails(RegBO regBo) {
		
		int count=0;
		Connection con=null;
		try{
			con=DBDetails.getConnection();
			String sql="insert into user_details values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, regBo.getUname());
			ps.setString(2, regBo.getPassword());
			ps.setString(3, regBo.getEmail());
			ps.setInt(4, regBo.getMobile());
			count=ps.executeUpdate();
			
		}
		catch(Exception e){
			System.out.println("inside RegDao :saveUserDetails()");
		}
		finally{
			try{
				con.close();
			}
			catch(SQLException sqlException){
				System.out.println("while closing exception");
			}
		}
		
		return count;
	}

}
