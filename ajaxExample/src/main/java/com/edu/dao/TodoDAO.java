package com.edu.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoDAO extends DAO {
	public List<Map<String, String>> todoList() {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		try {
			String sql = "SELECT * FROM TO_DO_LIST ORDER BY DO_ID";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Map<String, String> map = new HashMap<>();
				map.put("id", rs.getString("do_id"));
				map.put("content", rs.getString("do_content"));
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void insertTodo(String doContent) {
		String sql = "insert into to_do_list values(to_do_seq.nextval, ?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, doContent);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
