package Week2.day2;

public class Ex_03 {

	public static void main(String[] args) {
		//��������
		//&& (����), || (����), ����(!) : ������
		
		int score_kor= 90, score_eng= 80 ;
		
		//������ �������϶� �̰�(and) ����
		boolean result = ( (score_kor >= 90) 	&&	 (score_eng >=90) );//����
		boolean result2 = ( score_kor >=80 && score_eng >=90 );  //����
		
		// or ���� (�̰ų�)
		boolean resul3 = ( score_kor >= 90 	||	 score_eng >=90 );//��
		boolean result4 = ( score_kor >=80 || score_eng >=90 );  //��
		
		//! ������
		System.out.println( !result4);
		if(!result4) {
			System.out.println("���� �������?");
		} else {
			System.out.println("���� �������� �ſ�");
		}
	}
}
