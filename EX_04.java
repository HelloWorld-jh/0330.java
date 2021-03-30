package Week2.day2;

public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//복합 대입 연산자
		//+= , -=. /=, %=
		
		int num = 10;
		int num2 = 20;
		
		int sum = 0;
		
		sum += num; 	//sum = sum + num;
		System.out.println( sum);
		
		sum -=num; // sum = sum - num; //0
		System.out.print(sum);
		sum =1;
		
		sum *= num ; // sum = sum * num // 10
		
		
		sum=100;
		sum/=num; //sum= sum/num // 10
		
		sum=101;
		sum %= num; // sum = sum % num //1
		
		// 조건연산자(삼항연산자)
		// 조건식? 결과1(참) : 결과2(거짓) => 조건식에 따라 결과1 또는 결과2가 실행됨
		//예)
		int result = (15>3) ? 10 : 20;
		System.out.println( result);	//10
		
		int result2 = (15<3) ? 10 : 20;
		System.out.println( result2);	//20
		
	}

}
