package com.yedam.java.app;


public class MainExmaple {
	//public Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		new AccountFrame();
		
		
		/*
		boolean run = true;
		
		
		while(true) {
			
		menuPrint();
			int menuNo = menuSelect();
			
			if(menuNo == 1) {
				insertUser();
			} else if(menuNo == 2) {
				loginUser();
			} else if(menuNo == 3) {
				end();
				break;
			}
			new AccountFrame().run();
		}
		
		
		public static void menuPrint() {
			System.out.println();
			System.out.println("=== 1.회원가입 | 2.로그인 | 3.입금 ===");
			System.out.print("선택> ");
		}

		public static int menuSelect() {
			int menuNo = 0;
			try {
				menuNo = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("없는 메뉴입니다.");
			}
			return menuNo;
		}
		
		public static void insertUser() {
			User user = inputUserInfo();
			
			UserDAOImpl.getInstance().insert(user);
		}

		public static void loginUser() {
			User user = inputLoginInfo();
			User loginUser = UserDAOImpl.getInstance().slectUserInfo(user);
			if(loginUser == null) {
				System.out.println("회원정보를 확인해 주세요");
			} else if(loginUser.getAuth()==0){
				//관리자일때 실행하는 메뉴 ->일반회원일때 실행하는 메뉴랑 frame이 달라야한다
				new AccountFrame().run();
			} else if(loginUser.getAuth()==1) {
				//일반회원일때 실행하는 메뉴
			}
		}
		*/
	}
}
