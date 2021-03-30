package Week2.day2;

import java.util.Scanner;

public class Ex_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int menu =1; // 등록 1,2변경,3삭제,4조회,
		
		switch( menu) {
		
		case 1:
			System.out.println ("등록메뉴 선택");
			break;
		case 2:
			System.out.println ("변경메뉴 선택");
			break;
		case 3:
			System.out.println ("삭제메뉴 선택");
			break;
		case 4:
			System.out.println("조회메뉴 선택");
			break;
		default:
			System.out.println("등록메뉴 잘못");
			
		}
	}

}
