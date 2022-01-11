package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExample_emp13 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. JDBC Driver 로딩
				Class.forName("org.sqlite.JDBC");
				
				//2. DB 서버 접속
				String url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
				Connection conn = DriverManager.getConnection(url);
				
				/******************** INSERT ********************/
				//3. PreparedStatement 객체 생성
				String insert = "INSERT INTO emp13 VALUES (?,?,?,?,?,?,?)";
				PreparedStatement pstmt = conn.prepareStatement(insert);
				pstmt.setInt(1, 777);
				pstmt.setString(2, "Jang");
				pstmt.setString(3, "IT_PROG");
				pstmt.setInt(4, 3000);
				pstmt.setDouble(5, 0.2);
				pstmt.setString(6, "Marketing");
				pstmt.setInt(7, 7777);
				
				//4. SQL 실행
				int result = pstmt.executeUpdate();

				//5. 결과값 출력 or 연산
				System.out.println("insert 결과 : " + result);
				
				/******************** UPDATE ********************/
				//3. PreparedStatement 객체 생성
				String update = "UPDATE emp13 SET department_name = ? WHERE employee_id = ?";
				pstmt = conn.prepareStatement(update);
				pstmt.setString(1, "IT");
				pstmt.setInt(2, 777);
				
				//4. SQL 실행
				result = pstmt.executeUpdate();
				
				//5. 결과값 출력 or 연산
				System.out.println("update 결과 : " + result);
				
				/******************** SELECT ********************/
				//3. PreparedStatement 객체 생성
				String select = "SELECT * FROM emp13 ORDER BY employee_id";
				pstmt = conn.prepareStatement(select);
				
				//4. SQL 실행
				ResultSet rs = pstmt.executeQuery();
				
				//5. 결과값 출력 or 연산
				while(rs.next()) {
					String dept = "사원번호 : " + rs.getInt("employee_id") + ", 이름 : "+ rs.getString("first_name") + "           부서이름 : " + rs.getString("department_name");
					System.out.println(dept);
				}
				
				/******************** DELETE ********************/
				//3. PreparedStatement 객체 생성
				String delete = "DELETE FROM emp13 WHERE employee_id = ?";
				pstmt = conn.prepareStatement(delete);
				pstmt.setInt(1, 777);
				
				//4. SQL 실행
				result = pstmt.executeUpdate();
				
				//5. 결과값 출력 or 연산
				System.out.println("delete 결과 : " + result);
				
				//6. 자원해제
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
	}

}
