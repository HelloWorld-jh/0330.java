package Week2.day2;

import java.util.Scanner;

public class Ex_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int menu =1; // ��� 1,2����,3����,4��ȸ,
		
		switch( menu) {
		
		case 1:
			System.out.println ("��ϸ޴� ����");
			break;
		case 2:
			System.out.println ("����޴� ����");
			break;
		case 3:
			System.out.println ("�����޴� ����");
			break;
		case 4:
			System.out.println("��ȸ�޴� ����");
			break;
		default:
			System.out.println("��ϸ޴� �߸�");
			
		}
	}

}
