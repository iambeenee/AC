package com.yedam.java.app.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO { // department와 직접적으로 공유하는 dao

	// DB 연결정보
	private String jdbc_driver = "org.sqlite.JDBC";
	private String jdbc_url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";

	// 각 메소드에서 공통적으로 사용하는 필드
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 싱글톤
	private static DepartmentDAO instance = new DepartmentDAO();

	private DepartmentDAO() {
	}

	public static DepartmentDAO getInstance() {
		return instance;
	}

	// 메소드
	// JDBC Driver 로딩
	// DB 연결
	// -> connect() 메소드
	public void connect() {
		try {
			Class.forName(jdbc_driver); // JDBC Driver 로딩
			conn = DriverManager.getConnection(jdbc_url); // DB 연결
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB와 연결 실패");
		}
	}

	// 자원해제 -> disconnection() 메소드
	public void disconnect() {
		try {
			if (rs != null) // 생성과 반대순으로 해제
				rs.close();
			if (pstmt != null)
				rs.close();
			if (conn != null)
				rs.close();
		} catch (SQLException e) {
			System.out.println("자원이 정상적으로 해제되지 못했습니다.");
		}
	}

	// PreparedStatement 객체 생성
	// SQL 실행
	// 결과값 출력 or 연산
	// -> CRUD 메소드

	// 전체조회
	public List/* (리턴타입) */<Department> selectAll() {
		List<Department> list = new ArrayList<>(); // -> 리턴할 변수 선언
		try {
			connect(); // -> DB 연결
			String select = "SELECT * FROM departments ORDER BY department_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getString("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));
				list.add(dept); // ->list에 정보담기
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 단건조회
	public Department/* (리턴타입) */ selectOne(int departmentId/* (외부에서 받는 매개변수) */) {
		Department dept = null;
		try {
			connect();
			String select = "SELECT * FROM departments WHERE department_id = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setInt(1, departmentId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getString("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return dept;
	}

	// 등록
	public void insert(Department dept/* (보호객체를 매개변수) */) {
		try {
			connect();
			String insert = "INSERT INTO departments VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setString(3, dept.getManagerId());
			pstmt.setInt(4, dept.getLocationId());

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 등록되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 수정
	public void update(Department dept) {
		try {
			connect();
			String update = "UPDATE departments SET department_name = ? WHERE department_id = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, dept.getDepartmentName());
			pstmt.setInt(2, dept.getDepartmentId());

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 접수되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 삭제
	public void delete(int departmentId) {
		try {
			connect();
			String delete = "DELETE FROM departments WHERE department_id = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, departmentId);

			int result = pstmt.executeUpdate();
			System.out.println(result + "건이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
