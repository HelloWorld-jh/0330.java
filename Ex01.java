package Week2.day2;

public class Ex01 {
	public static void main(String[] args) {
		
		int num= 125;
		int num2= 1200;
		double avg= 98.232;
		float avg1= (float)98.23;
		
		//리터럴도 자료형을 가진다.
		//float avg1= 98.23f;
		
		// 125
		// 210000000L
		// 23.23
		// 23.23f
		
		char ch= '한';
		char ch2 = 'a';
		System.out.println(ch+", "+ch2);
		//문자 => 숫자로 저장되어 있음
		System.out.println((int)ch+", "+ (int)ch2);
		
		//문자열
		String str="hello";
		System.out.println(str);
		
		//
		char[] arr = new char[5];
		arr[0]= 'h';
		arr[1]='e';
		arr[2]='l';
		arr[3]='l';
		arr[4]='o';
		
		for(int i=0; i<5;i++) {
			System.out.print(arr[i]);
			
		}
		boolean flag= true; // true= 1참/ false= 0 거짓
		System.out.println( flag);
		
		
	}
}
