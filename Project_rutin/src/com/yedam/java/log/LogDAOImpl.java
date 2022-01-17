package com.yedam.java.log;

import java.sql.SQLException;

import com.yedam.java.common.DAO;

public class LogDAOImpl extends DAO implements LogDAO {
	// 싱글톤

	private static LogDAO instance = new LogDAOImpl();

	private LogDAOImpl() {

	}

	public static LogDAO getInstance() {
		return instance;
	}

	// 회원가입
	@Override
	public void createUser(Log log) {
		try {
			connect();
			String insert = "INSERT INTO Log VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, log.getId());
			pstmt.setString(2, log.getPassword());
			pstmt.setString(3, log.getUserName());
			pstmt.setString(4, log.getPhone());

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("회원가입 완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public int loginUser(String id, String password) {
		try {
			connect();
			String select = "SELECT password FROM Log WHERE id = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(1).contentEquals(password)) {
					int result = 1;
					return result; //로그인 성공
				} else {
					int result = 0;
					return result; //비번 불일치
				}
			}
			int result = -1;
			return result; //아이디 x

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 0;
	}

}
