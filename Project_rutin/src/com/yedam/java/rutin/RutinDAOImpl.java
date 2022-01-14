package com.yedam.java.rutin;

import java.sql.SQLException;
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
			String insert = "INSERT INTO Rutin (date, time, rutin_name, memo) VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, rutin.getDate());
			pstmt.setInt(2, rutin.getTime());
			pstmt.setString(3, rutin.getRutinName());
			pstmt.setString(4, rutin.getMemo());

			int result = pstmt.executeUpdate();
			System.out.println(result + "건 등록완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 전체조회
	@Override
	public List<Rutin> selectAll() {
		List<Rutin> list = new ArrayList();
		try {
			connect();
			String select = "SELECT * FROM Rutin ORDER BY time";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Rutin rutin = new Rutin();
				rutin.setDate(rs.getInt("date"));
				rutin.setTime(rs.getInt("time"));
				rutin.setRutinName(rs.getString("rutin_name"));
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

	// 단건조회
	@Override
	public Rutin selectOne(int date) {
		Rutin rutin = null;
		try {
			connect();
			String select = "SELECT * FROM Rutin WHERE date = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setInt(1, date);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				rutin = new Rutin();
				rutin.setDate(rs.getInt("date"));
				rutin.setTime(rs.getInt("time"));
				rutin.setRutinName(rs.getString("rutin_name"));
				rutin.setMemo(rs.getString("memo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return rutin;
	}

	// 루틴내용수정
	@Override
	public void updateContent(Rutin rutin) {
		try {
			connect();
			String update = "UPDATE rutin SET name = ?, memo = ? WHERE name = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, rutin.getRutinName());
			pstmt.setString(2, rutin.getMemo());
			pstmt.setString(3, rutin.getRutinName());

			int result = pstmt.executeUpdate();
			System.out.println("수정 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 전체삭제
	@Override
	public void deleteAll(Rutin rutin) {
		try {
			connect();
			String delete = "DELETE FROM Rutin WHERE date = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, date);

			int result = pstmt.executeUpdate();
			System.out.println("삭제 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 단건삭제
	@Override
	public void deleteOne(int date, String name) {
		try {
			connect();
			String delete = "DELETE FROM Rutin WHERE date = ? AND name = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, date);
			pstmt.setString(2, name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

}
