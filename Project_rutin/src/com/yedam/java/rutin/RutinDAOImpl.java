package com.yedam.java.rutin;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class RutinDAOImpl extends DAO implements RutinDAO {
	//
	private static RutinDAO instance = new RutinDAOImpl();

	private RutinDAOImpl() {
	}

	public static RutinDAO getInstance() {
		return instance;
	}
	
	// 루틴 생성
	@Override
	public void createRutin(Rutin rutin) {
		try {
			connect();
			String insert = "INSERT INTO Rutin (date, time, name, memo) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, rutin.getDate());
			pstmt.setString(2, rutin.getTime());
			pstmt.setString(3, rutin.getName());
			pstmt.setString(4, rutin.getMemo());

			int result = pstmt.executeUpdate();
			System.out.println(result + "건 등록완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 조회
	// 오늘 / 특정 일 / 특정 월 / 특정 단어 / 전체
	@Override
	public List<Rutin> selectRutin(String key, String value) {
		List<Rutin> list = new ArrayList<>();
		try {
			connect();
			String select = "";
			if(key.equals("today") || key.equals("day") || key.equals("month") || key.equals("content")){
				select += "SELECT date, time, name, memo FROM Rutin";
			
				if(key.equals("today")) {
					select += "WHERE INSTR(date, ?) > 0";
				} else if(key.equals("day")) {
					select += "WHERE INSTR(date, ?) > 0";
				} else if(key.equals("month")) {
					select += "WHERE INSTR(SUBSTR(date, 1, 7),?) > 0";
				} else if(key.equals("content")) {
					select += "WHERE INSTR(memo, ?) > 0";
				} 
			
				pstmt = conn.prepareStatement(select);
				pstmt.setString(1, value);
			
		} else if(key.equals("full")) {
			select += "SELECT * FROM Rutin ORDER BY date";
			
			pstmt = conn.prepareStatement(select);
		}

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Rutin rutin = new Rutin();
				rutin = new Rutin();
				rutin.setDate(rs.getString("date"));
				rutin.setTime(rs.getString("time"));
				rutin.setName(rs.getString("name"));
				rutin.setMemo(rs.getString("memo"));
				list.add(rutin);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 수정
	@Override
	public void updateContent(Rutin rutin) {
		try {
			connect();
			String update = "UPDATE Rutin SET date = ?, time = ?, name = ?, memo = ? WHERE num = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, rutin.getDate());
			pstmt.setString(2, rutin.getTime());
			pstmt.setString(3, rutin.getName());
			pstmt.setString(4, rutin.getMemo());
			pstmt.setInt(5, rutin.getNum());

			pstmt.executeUpdate();
			System.out.println("수정 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 삭제
	@Override
	public void deleteAll(int num) {
		try {
			connect();
			String delete = "DELETE FROM Rutin WHERE num = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, num);

			pstmt.executeUpdate();
			System.out.println("삭제 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	/*
	// 단건삭제
	@Override
	public void deleteOne(String rutinName) {
		try {
			connect();
			String delete = "DELETE FROM Rutin WHERE rutin_name = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, rutinName);
			
			int result = pstmt.executeUpdate();
			System.out.println("삭제완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
		*/

}
