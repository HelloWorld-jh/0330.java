package Week2.day2;

public class ex_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge=27, yourAge=25;
		if( myAge > yourAge) {
			System.out.println ("내가 형이야");
		/* if ( myAge > yourAge ) {
		 		System.out.println("내가 형이야");
		 		}
		 /*
		  * if( myAge > yourAge) {
		  		System.out.println('내가 형이야");
		  		}
		  */
			
			if ( myAge < yourAge) {
				System.out.println ("내가 형이야");
			}else {
				System.out.println("친구이거나 너가 형이야");
			}
		}
//		*/
		myAge= 25;
		yourAge=25;
		if( myAge > yourAge) {
			System.out.println("내가 형이야");
		}else if( myAge < yourAge) {
			System.out.println(" 너가 형이야");
		}else {
			System.out.println("우리 친구");
		
		//문제 성적
		int score = 10; //(0~100)
		int A = 90, B = 80, C = 70;
		
		//점수 => A(90이상), B(80이상), C(70이상), D: 나머지
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
