package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.department.Department;
import com.yedam.java.emp13.Emp13;
import com.yedam.java.emp13.Emp13DAO;
import com.yedam.java.emp13.Emp13DAOImpl;

public class Emp13Frame {

	private Emp13DAO empDAO = Emp13DAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);

	public Emp13Frame() {
		while (true) {
			// 메뉴출력
			menuPrint();

			// 메뉴선택
			int menuNo = menuSelect();

			// 각 메뉴별 실행
			if (menuNo == 1) {
				// 등록
				insertEmp13();
			} else if (menuNo == 2) {
				// 수정
				updateEmp13();
			} else if (menuNo == 3) {
				// 삭제
				deleteEmp13();
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
		System.out.print("선택> ");
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

	public void insertEmp13() {
		// 사번 입력
		Emp13 emp = inputEmpInfo();
		// 정보 등록
		empDAO.insert(emp);
	}

	public void updateEmp13() {
		// 사번 입력
		Emp13 emp = inputEmployeeId();
		// 연봉 수정
		empDAO.update(emp);
	}

	public void deleteEmp13() {
		// 사번 입력
		int employeeId = inputEmpId();
		// 삭제
		empDAO.delete(employeeId);
	}

	public void selectOne() {
		// 사번 입력
		int employeeId = inputEmpId();
		// 조회
		Emp13 emp = empDAO.selectOne(employeeId);
		// 출력
		if (emp == null) {
			System.out.println("해당 사원 정보가 존재하지 않습니다.");
		} else {
			System.out.println(emp);
		}
	}

	public void selectAll() {
		// 전체 조회
		List<Emp13> list = empDAO.selectAll();
		// 전체 출력
		for (Emp13 emp : list) {
			System.out.println(emp);
		}
	}

	public void end() {
		System.out.println("프로그램 종료");
	}

	// 등록
	public Emp13 inputEmpInfo() {
		Emp13 emp = new Emp13();
		System.out.print("사번> ");
		emp.setEmployeeId(Integer.parseInt(scanner.nextLine()));
		System.out.print("이름> ");
		emp.setFirstName(scanner.nextLine());
		System.out.print("직급> ");
		emp.setJobId(scanner.nextLine());
		System.out.print("연봉> ");
		emp.setSalary(Integer.parseInt(scanner.nextLine()));
		System.out.print("상여> ");
		emp.setCommissionPct(scanner.nextLine());
		System.out.print("부서> ");
		emp.setDepartmentName(scanner.nextLine());
		System.out.print("지역번호> ");
		emp.setLocationId(Integer.parseInt(scanner.nextLine()));
		return emp;
	}

	// 수정
	public Emp13 inputEmployeeId() {
		Emp13 emp = new Emp13();
		System.out.print("사번>");
		emp.setEmployeeId(Integer.parseInt(scanner.nextLine()));
		System.out.print("연봉>");
		emp.setSalary(Integer.parseInt(scanner.nextLine()));
		return emp;
	}

	// 삭제, 단건조회
	public int inputEmpId() {
		int employeeId = 0;
		System.out.println("사번");
		employeeId = Integer.parseInt(scanner.nextLine());
		return employeeId;
	}

}
