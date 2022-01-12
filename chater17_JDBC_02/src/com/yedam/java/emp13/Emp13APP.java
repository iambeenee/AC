package com.yedam.java.emp13;

import java.util.List;
import java.util.Scanner;

public class Emp13APP {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		Emp13DAO dao = Emp13DAO.getInstance();

		Emp13 emp = null;
		int employeeId = 0;

		while (run) {
			System.out.println();
			System.out.println("=== 1.등록 2.수정 3.삭제 4.부서조회 5.전체조회 9.종료 ===");
			System.out.print("선택>");
			int menuNo = Integer.parseInt(scanner.nextLine());

			switch (menuNo) {
			case 1:
				emp = new Emp13();
				System.out.print("사번>");
				emp.setEmployeeId(Integer.parseInt(scanner.nextLine()));
				System.out.print("이름>");
				emp.setFirstName(scanner.nextLine());
				System.out.print("직급>");
				emp.setJobId(scanner.nextLine());
				System.out.print("연봉>");
				emp.setSalary(Integer.parseInt(scanner.nextLine()));
				System.out.print("상여");
				emp.setCommissionPct(scanner.nextLine());
				System.out.print("부서");
				emp.setDepartmentName(scanner.nextLine());
				System.out.print("위치");
				emp.setLocationId(Integer.parseInt(scanner.nextLine()));
				dao.insert(emp);
				break;
			case 2:
				emp = new Emp13();
				System.out.print("사번>");
				emp.setEmployeeId(Integer.parseInt(scanner.nextLine()));
				System.out.print("연봉>");
				emp.setSalary(Integer.parseInt(scanner.nextLine()));
				dao.update(emp);
				break;
			case 3:
				System.out.print("사번>");
				employeeId = Integer.parseInt(scanner.nextLine());
				dao.delete(employeeId);
				break;
			case 4:
				System.out.print("사번>");
				employeeId = Integer.parseInt(scanner.nextLine());
				emp = dao.selectOne(employeeId);
				System.out.println(emp);
				break;
			case 5:
				List<Emp13> list = dao.selectAll();
				for(Emp13 emp13 : list) {
					System.out.println(emp13);
				}
				break;
			case 9:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}

		}

	}
}
