package Week2.day2;

public class Ex01 {
	public static void main(String[] args) {
		
		int num= 125;
		int num2= 1200;
		double avg= 98.232;
		float avg1= (float)98.23;
		
		//���ͷ��� �ڷ����� ������.
		//float avg1= 98.23f;
		
		// 125
		// 210000000L
		// 23.23
		// 23.23f
		
		char ch= '��';
		char ch2 = 'a';
		System.out.println(ch+", "+ch2);
		//���� => ���ڷ� ����Ǿ� ����
		System.out.println((int)ch+", "+ (int)ch2);
		
		//���ڿ�
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
		boolean flag= true; // true= 1��/ false= 0 ����
		System.out.println( flag);
		
		
	}
}
