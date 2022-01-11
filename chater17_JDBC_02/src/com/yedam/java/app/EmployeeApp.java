package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		EmployeesDAO dao = EmployeesDAO.getInstance();
		
		Employee emp = null;
		int employeeId = 0;
		while(run) {
			System.out.println();
			System.out.println("=== 1.등록 2.수정 3.삭제 4.사원조회 5.전체조회 9.종료 ===");
			System.out.print("선택 > ");
			int menuNo = scanner.nextInt();
			
			switch(menuNo) {
			case 1:
				emp = new Employee();
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
				
				dao.insert(emp);
				break;
			case 2:
				emp = new Employee();
				System.out.print("사번 > ");
				emp.setEmployeeId(scanner.nextInt());
				System.out.print("연봉 > ");
				emp.setSalary(scanner.nextInt());
				
				dao.update(emp);				
				break;
			case 3:
				System.out.print("사번 > ");
				employeeId = scanner.nextInt();
				
				dao.delete(employeeId);				
				break;
			case 4:
				System.out.print("사번 > ");
				employeeId = scanner.nextInt();
				emp = dao.selectOne(employeeId);
				System.out.println(emp);
				break;
			case 5:
				List<Employee> list = dao.selectAll();
				for(Employee employee : list) {
					System.out.println(employee);
				}
				break;
			case 9:
				run = false;
				System.out.println("프로그램을 종료");
				break;
			}
		}
		
}
}
