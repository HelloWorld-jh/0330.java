package Week2.day2;

public class Ex_03 {

	public static void main(String[] args) {
		//논리연산자
		//&& (논리곱), || (논리합), 부정(!) : 논리부정
		
		int score_kor= 90, score_eng= 80 ;
		
		//조건이 여러개일때 이고(and) 조건
		boolean result = ( (score_kor >= 90) 	&&	 (score_eng >=90) );//거짓
		boolean result2 = ( score_kor >=80 && score_eng >=90 );  //거짓
		
		// or 조건 (이거나)
		boolean resul3 = ( score_kor >= 90 	||	 score_eng >=90 );//참
		boolean result4 = ( score_kor >=80 || score_eng >=90 );  //참
		
		//! 논리부정
		System.out.println( !result4);
		if(!result4) {
			System.out.println("내가 찍힐까요?");
		} else {
			System.out.println("내가 안찍혀야 돼요");
		}
	}
}
