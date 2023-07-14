package main.java.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbConnection {
	   
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
}
