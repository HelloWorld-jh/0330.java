package Week2.day2;

public class Ex_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단
		
		//2단 출력
//		System.out.print(2*1);
//		System.out.print(2*2);
//		System.out.print(2*3);
//		System.out.print(2*4);
//		System.out.print(2*5);
//		System.out.print(2*6);
//		System.out.print(2*7);
//		System.out.print(2*8);
//		System.out.print(2*9);
//		
		
		for(int i=1; i<=9; i++) {
			System.out.print("2*"+i +"="+2*i);
			
		}
		
		int[] arry = { 10,20,25,50,99};
		
		System.out.println( arry[0]);
		System.out.println( arry[1]);
		System.out.println( arry[2]);
		System.out.println( arry[3]);
		System.out.println( arry[4]);
	
		for( int i=0; i<5; i++) {
			System.out.println( arry[i]);
			
		}
	}

}
