package com.yedam.java.app;

import java.util.Scanner;

import com.yedam.java.department.Department;
import com.yedam.java.emp13.Emp13DAO;
import com.yedam.java.emp13.Emp13DAOImpl;

public class Emp13Frame {
	
	private Emp13DAO empDAO = Emp13DAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	
	public DepartmentFrame() {
		while (true) { 
			// 메뉴출력
			menuPrint();

			// 메뉴선택
			int menuNo = menuSelect();

			// 각 메뉴별 실행
			if (menuNo == 1) {
				// 등록
				insertDepartment();
			} else if (menuNo == 2) {
				// 수정
				updateDepartment();
			} else if (menuNo == 3) {
				// 삭제
				deleteDepartment();
			} else if (menuNo == 4) {
				// 단건조회
				selectOne();
			} else if (menuNo == 5) {
				// 전체조회
				selectAll();
			} else if (menuNo == 9) {
				// 종료
				end();
				break;
			}

		}
	}
	public void menuPrint() {
		System.out.println();
		System.out.println("=== 1.등록 2.수정 3.삭제 4.단건조회 5.전체조회 9.종료 ===");
		System.out.print("선택>");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}
		public void insertDepartment() {
			// 부서정보 입력
			Department dept = inputDeptInfo();
			// 부서정보 등록
			deptDAO.insert(dept);
		}
}
