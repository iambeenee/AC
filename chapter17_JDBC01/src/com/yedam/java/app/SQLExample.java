package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");

		// 2. DB 서버 접속
		String url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(url);

		/******************** INSERT ********************/
		// 3. Statement or PreparedStatement 객체 생성
		String insert = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?,?,?)"; // 컬럼 수만큼 물음표 입력 후 물음표 수만큼 세터를 채워야함
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "kil-Dong");
		pstmt.setString(3, "Hong");
		pstmt.setString(4, "kdHong@google.com");
		pstmt.setString(5, "8.10.1234.1234");
		pstmt.setString(6, "21//1//05");
		pstmt.setString(7, "SA_REP");
		pstmt.setInt(8, 6000);
		pstmt.setDouble(9, 0.15);
		pstmt.setInt(10, 149);
		pstmt.setInt(11, 80);

		// 4. SQL 실행
		int result = pstmt.executeUpdate();

		// 5. 결과값 출력 or 연산
		System.out.println("insert 결과 : " + result);

		/******************** UPDATE ********************/
		// 3. Statement or PreparedStatement 객체 생성
		String update = "UPDATE employees SET last_name = ? WHERE employee_id = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Kang");
		pstmt.setInt(2, 1000);

		// 4. SQL 실행
		result = pstmt.executeUpdate();

		// 5. 결과값 출력 or 연산
		System.out.println("update 결과 : " + result);

		/******************** SELECT ********************/
		// 3. Statement or PreparedStatement 객체 생성
		String select = "SELECT * FROM employees ORDER BY employee_id"; // ORDER BY -> 컬럼을 기준을 정렬
		pstmt = conn.prepareStatement(select);

		// 4. SQL 실행
		ResultSet rs = pstmt.executeQuery();

		// 5. 결과값 출력 or 연산
		while (rs.next()) {
			String name = "사원번호 : " + rs.getInt("employee_id") + ", 이름 : " + rs.getString("first_name") + "  "
					+ rs.getString("last_name");
			System.out.println(name);
		}

		/******************** DELETE ********************/
		// 3. Statement or PreparedStatement 객체 생성
		String delete = "DELETE FROM employees WHERE employee_id = ?";
		pstmt = conn.prepareStatement(delete);
		pstmt.setInt(1, 1000);
		// 4. SQL 실행
		result = pstmt.executeUpdate();
		// 5. 결과값 출력 or 연산
		System.out.println("delete 결과 : " + result);
		
		// 6. 자원해제
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}
}
