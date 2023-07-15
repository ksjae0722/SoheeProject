package main.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.dto.CustomerDTO;

public class RegisterDAO {
	   Connection conn = null;
	   PreparedStatement pstmt;
	   
	   final String JDBC_DRIVER = "org.h2.Driver";
	   
	   final String JDBC_URL = "jdbc:h2:tcp://localhost/~/tdat";
	   
	   public void open() {
		      try {
		         //1. JDBC드라이버 로드
		         Class.forName(JDBC_DRIVER);
		         //2. 데이터베이스 연결
		         conn = DriverManager.getConnection(JDBC_URL, "sohee", "1009");
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		   }
	   
	   public void close() {
		      try {
		         pstmt.close();
		         conn.close();
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		   }
	   
	   public void register(CustomerDTO c) {
		   open();
		   String sql = "INSERT INTO CUSTOMER(userName, email, phoneNumber, address, z_code, userID, userPassword) VALUES(?,?,?,?,?,?,?)";
		   
		   try {
			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, c.getUserName());
			   pstmt.setString(2, c.getEmail());
			   pstmt.setString(3, c.getPhoneNumber());
			   pstmt.setString(4, c.getAddress());
			   pstmt.setString(5, c.getZ_code());
			   pstmt.setString(6, c.getUserID());
			   pstmt.setString(7, c.getUserPassword());
			   
			   pstmt.executeUpdate();
			   
		   } catch (SQLException e) {
			   e.printStackTrace();
		   } finally {
			   close();
		   }
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
