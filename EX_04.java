package Week2.day2;

public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ���� ������
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
		
		// ���ǿ�����(���׿�����)
		// ���ǽ�? ���1(��) : ���2(����) => ���ǽĿ� ���� ���1 �Ǵ� ���2�� �����
		//��)
		int result = (15>3) ? 10 : 20;
		System.out.println( result);	//10
		
		int result2 = (15<3) ? 10 : 20;
		System.out.println( result2);	//20
		
	}

}
