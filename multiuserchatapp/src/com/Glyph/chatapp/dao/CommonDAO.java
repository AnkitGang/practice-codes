package com.Glyph.chatapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.Glyph.chatapp.utils.ConfigReader.getValue;

//Throw Early and Catch Later
//public class CommonDAO {

//we made interface of this class becoz it will be called many times likes register, login, so too many objects, more memory consumption.
public interface CommonDAO {
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		//Step-1 Load a Driver
		Class.forName(getValue("DRIVER"));  //reads from config.properties file
		
		//Step-2 Making a Connection
		final String CONNECTION_STRING = getValue("CONNECTION_URL");
		final String USER_ID = getValue("USERID");
		final String PASSWORD = getValue("PASSWORD");
		Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_ID, PASSWORD);
		if(con != null) {
			System.out.println("Connection Established...");
			//con.close();
		}
		
		return con;
	}
	
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		CommonDAO commonDAO = new CommonDAO();
//		commonDAO.createConnection();
//	}
}
