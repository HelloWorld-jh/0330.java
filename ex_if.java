package Week2.day2;

public class ex_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge=27, yourAge=25;
		if( myAge > yourAge) {
			System.out.println ("���� ���̾�");
		/* if ( myAge > yourAge ) {
		 		System.out.println("���� ���̾�");
		 		}
		 /*
		  * if( myAge > yourAge) {
		  		System.out.println('���� ���̾�");
		  		}
		  */
			
			if ( myAge < yourAge) {
				System.out.println ("���� ���̾�");
			}else {
				System.out.println("ģ���̰ų� �ʰ� ���̾�");
			}
		}
//		*/
		myAge= 25;
		yourAge=25;
		if( myAge > yourAge) {
			System.out.println("���� ���̾�");
		}else if( myAge < yourAge) {
			System.out.println(" �ʰ� ���̾�");
		}else {
			System.out.println("�츮 ģ��");
		
		//���� ����
		int score = 10; //(0~100)
		int A = 90, B = 80, C = 70;
		
		//���� => A(90�̻�), B(80�̻�), C(70�̻�), D: ������
		if( score >= 90) {
			System.out.println("A");
		}else if( score >= 80) {
				System.out.println("B");
		}else if( score >= 70) {
				System.out.println("C");
		}else {
			System.out.println("D");
		}
		
					
		
		
		
	}

}
}
