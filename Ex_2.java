package Week2.day2;

public class Ex_2 {
	public static void main(String[]args) {
		int a= 10;
		int result1 = a++;	//
		System.out.println(result1+" "+  a); //10, 11
		
		int result2= ++a;	//12,12
		System.out.println(result2+ " "+ a); //12,12
		//���迬���� :
		//		>, <, >=, <=, ==, !=
		
			int myAge= 27;
			boolean value= ( myAge > 25 );
			System.out.println( value);	// true
			
			boolean value1 = (myAge < 25);
			System.out.println( value1); //false
			
			boolean value2 = (myAge >= 25);
			System.out.println( value2); //false
			
			boolean value3 = (myAge <= 25);
			System.out.println( value3); //false
			
			boolean value4 = (myAge == 25);
			System.out.println( value4); //false
			// if(myAge = 25) {			} ==����
			// ��ǻ�Ϳ��� 0�ΰ��� ���� ��, 0�� �ƴ� ���� ��� ����
			boolean value5 = (myAge != 25);
			System.out.println( value5); //true
	}
}
