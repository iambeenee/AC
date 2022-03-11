package com.edu.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDAO extends DAO {
	public List<Map<String, String>> empList() {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		try {
			String sql = "SELECT FIRST_NAME, SALARY FROM EMPLOYEES WHERE SALARY IS NOT NULL";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Map<String, String> map = new HashMap<>();
				map.put("name", rs.getString("first_name")); //{"first_name": "salary": }
				map.put("age", rs.getString("salary"));
				
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertEmp(String firstName, int salary) {
		String sql = "insert into employees(employee_id, last_name, email, hire_date, job_id, first_name, salary)\r\n"
				+ "values(employees_seq.nextval, 'last', 'email.com'||employees_seq.CURRVAL, sysdate, 'IT_PROG',? ,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, firstName);
			psmt.setInt(2, salary);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
