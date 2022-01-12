package com.yedam.java.app.dept;

import java.util.List;
import java.util.Scanner;

public class DepartmentApp {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		DepartmentDAO dao = DepartmentDAO.getInstance(); // ->dao 정보를 받기위한

		Department dept = null;
		int departmentId = 0;

		while (run) {
			System.out.println();
			System.out.println("=== 1.등록 2.수정 3.삭제 4.부서조회 5.전체조회 9.종료");
			System.out.print("선택>");
			int menuNo = Integer.parseInt(scanner.nextLine());

			switch (menuNo) {
			case 1:
				dept = new Department();
				System.out.print("부서번호>");
				dept.setDepartmentId(Integer.parseInt(scanner.nextLine()));
				System.out.print("부서이름");
				dept.setDepartmentName(scanner.nextLine());
				System.out.print("매니저번호");
				dept.setManagerId(scanner.nextLine());
				System.out.print("지역번호>");
				dept.setLocationId(Integer.parseInt(scanner.nextLine()));
				dao.insert(dept);
				break;
			case 2:
				dept = new Department();
				System.out.print("부서번호>");
				dept.setDepartmentId(Integer.parseInt(scanner.nextLine()));
				System.out.println("부서이름>");
				dept.setDepartmentName(scanner.nextLine());
				dao.update(dept);
				break;
			case 3:
				System.out.println("부서번호>");
				departmentId = Integer.parseInt(scanner.nextLine());
				dao.delete(departmentId);
				break;
			case 4:
				System.out.print("부서번호>");
				departmentId = Integer.parseInt(scanner.nextLine());
				dept = dao.selectOne(departmentId);
				System.out.println(dept);
				break;
			case 5:
				List<Department> list = dao.selectAll();
				for (Department department : list) {
					System.out.println(department);
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
