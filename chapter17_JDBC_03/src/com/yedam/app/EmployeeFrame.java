package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.employee.Employee;
import com.yedam.app.employee.EmployeeDAO;
import com.yedam.app.employee.EmployeeDAOImpl;

public class EmployeeFrame {
	private EmployeeDAO empDAO = EmployeeDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);

	public EmployeeFrame() {
		while (true) {
			// 메뉴출력
			menuPrint();

			// 메뉴선택
			int menuNo = menuSelect();

			// 각 메뉴별로 기능을 실행
			if (menuNo == 1) {
				insertEmployee();
			} else if (menuNo == 2) {
				updateEmployee();
			} else if (menuNo == 3) {
				deleteEmployee();
			} else if (menuNo == 4) {
				selectOne();
			} else if (menuNo == 5) {
				selectAll();
			} else if (menuNo == 9) {
				end();
				break;
			}

		}
	}

	public void menuPrint() {
		System.out.println();
		System.out.println("=== 1.등록 2.수정 3.삭제 4.사원조회 5.전체조회 9.종료 ===");
		System.out.print("선택 > ");
	}

	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	public void insertEmployee() {

		Employee emp = inputEmployeeInfo();
		empDAO.insert(emp);
	}

	public void updateEmployee() {

		Employee emp = inputEmployeeSalary();
		empDAO.update(emp);
	}

	public void deleteEmployee() {

		int employeeId = inputEmployeeId();
		empDAO.delete(employeeId);
	}

	public void selectOne() {
		int employeeId = inputEmployeeId();
		Employee emp = empDAO.selectOne(employeeId);
		System.out.println(emp);
	}

	public void selectAll() {
		List<Employee> list = empDAO.selectAll();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

	public void end() {
		System.out.println("프로그램 종료");
	}

	public Employee inputEmployeeInfo() {

		Employee emp = new Employee();
		System.out.print("사번 > ");
		emp.setEmployeeId(scanner.nextInt());
		System.out.print("이름 > ");
		emp.setFirstName(scanner.next());
		System.out.print("성 > ");
		emp.setLastName(scanner.next());
		System.out.print("이메일 > ");
		emp.setEmail(scanner.next());
		System.out.print("전화번호 > ");
		emp.setPhoneNumber(scanner.next());
		System.out.print("입사일 > ");
		emp.setHireDate(scanner.next());
		System.out.print("직급 > ");
		emp.setJobId(scanner.next());
		System.out.print("연봉 > ");
		emp.setSalary(scanner.nextInt());
		System.out.print("상여 > ");
		emp.setCommisionPct(scanner.next());
		System.out.print("상사 > ");
		emp.setManagerId(scanner.next());
		System.out.print("부서 > ");
		emp.setDepartmentId(scanner.next());

		return emp;
	}

	public Employee inputEmployeeSalary() {
		Employee emp = new Employee();

		System.out.print("사번 > ");
		emp.setEmployeeId(scanner.nextInt());
		System.out.print("연봉 > ");
		emp.setSalary(scanner.nextInt());

		return emp;
	}

	public int inputEmployeeId() {
		System.out.print("사번 > ");
		int employeeId = scanner.nextInt();

		return employeeId;
	}
}
