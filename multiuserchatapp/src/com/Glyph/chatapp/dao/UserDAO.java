package com.Glyph.chatapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Glyph.chatapp.dto.UserDTO;
import com.Glyph.chatapp.utils.Encryption;

//for USER CRUD operations
public class UserDAO {
	// there can be too many fields later in the code,so we make a separate class
	// for it. UserDTO (Data Transfer Object)

//	public int add(String userid, String password, String city, String country, String state, String stdCode, String areaCode, String phone) {
//		
//	}
	
	public boolean isLogin(UserDTO userDTO) throws SQLException, ClassNotFoundException, Exception {
		Connection con = null;
		//Statement statement = null;
		PreparedStatement preparedStatement = null; //same as above Statement but it is precompiled and makes placeholder in query which makes it easy
		ResultSet rs = null;
		final String SQL = "select userid from users where userid=? and password=?";
//																  ^				 ^
		try {											//		 / \			/ \
			con = CommonDAO.createConnection();			//		  |				 | 
			preparedStatement = con.prepareStatement(SQL);//	  |				 |
			preparedStatement.setString(1, userDTO.getUserid());//-				 |
			String enryptedPwd = Encryption.passwordEncypt(new String(userDTO.getPassword()));
			preparedStatement.setString(2, enryptedPwd);//-----------------------|
			rs = preparedStatement.executeQuery();
			return rs.next();  //.next checks whether rs is able to find the record in database..returns boolean value
//			if(rs.next()) {  // 
//				return true;
//			}
//			else {
//				return false;
//			}
		}
		finally {
			if(rs != null) {
				rs.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(con != null) {
				con.close();
			}
		}
	}
	
	public int add(UserDTO userDTO) throws ClassNotFoundException, SQLException, Exception { //throws means we don't handle the error, caller will handle
		System.out.println("userid " + userDTO.getUserid() + " " + userDTO.getPassword().toString());
		Connection connection = null;
		Statement statement = null; // SQL Query

		try {  //Guarded Region
			// Step-1 Connection Create
			connection = CommonDAO.createConnection();
			// Step-2 We do a Query
			statement = connection.createStatement();
			// Query-> insert into users(userid, password) values('ram', 'ram123');
			int record = statement.executeUpdate("insert into users(userid, password) values('" + userDTO.getUserid()+ "', '" + Encryption.passwordEncypt(new String(userDTO.getPassword())) + "');"); // Insert, Delete, Update
			return record; //record returns either 0 or 1
		} 
		finally {  //Always Execute (Resource Clean)
			if(statement != null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
	}
}
