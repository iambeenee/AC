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
			String insert = "INSERT INTO Rutin (date, time, name, memo) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, rutin.getDate());
			pstmt.setString(2, rutin.getTime());
			pstmt.setString(3, rutin.getName());
			pstmt.setString(4, rutin.getMemo());

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("등록완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 날짜전체조회
	public List<Rutin> selectRutin() {
		List<Rutin> list = new ArrayList<>();
		Rutin rutin = new Rutin();
		try {
			connect();
			String select = "SELECT * FROM Rutin ORDER BY date";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();

			int sum = 0;
			while (rs.next()) {
				rutin = new Rutin();
				rutin.setNum(rs.getInt("num"));
				rutin.setComplete(rs.getInt("complete"));
				rutin.setDate(rs.getString("date"));
				rutin.setTime(rs.getString("time"));
				rutin.setName(rs.getString("name"));
				rutin.setMemo(rs.getString("memo"));
				list.add(rutin);
				sum++;
			}

			System.out.printf("%s개의 일정이 있습니다.%n", sum);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 일자별 루틴 조회
	public Rutin selectOne(String date) {
		Rutin rutin = null;
		try {
			connect();
			String select = "SELECT * FROM Rutin WHERE date = ?";
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return rutin;
	}

	// 수정
	@Override
	public void updateRutin(Rutin rutin) {
		try {
			connect();
			String update = "UPDATE Rutin SET date = ?, time = ?, name = ?, memo = ? WHERE num = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, rutin.getDate());
			pstmt.setString(2, rutin.getTime());
			pstmt.setString(3, rutin.getName());
			pstmt.setString(4, rutin.getMemo());
			pstmt.setInt(5, rutin.getNum());

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("수정완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// check
	@Override
	public void checkRutin(Rutin rutin) {
		try {
			connect();
			String update = "UPDATE Rutin SET complete = ? WHERE num = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, rutin.getComplete());
			pstmt.setInt(2, rutin.getNum());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("수정완료");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 삭제
	@Override
	public void deleteRutin(int num) {
		try {
			connect();
			String delete = "DELETE FROM Rutin WHERE num = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, num);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("삭제완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

}
