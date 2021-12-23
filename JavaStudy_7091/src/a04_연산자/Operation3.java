package a04_연산자;

/**
 * 
 * 삼항연산자(조건연산자) 
 * 조건 ? 결과(참) : 결과 (거짓) 
 * @author ITPS
 *
 */

public class Operation3 {

	public static void main(String[] args) {
		int score = 81;
		
		
		int number = (score == 100) ? 100 : (score > 89) ? 90 : (score > 79) ? 80 : 0; 
		
		System.out.println(number);
		
		char grade = (score == 100) ? 'A' : (score > 89) ? 'A' : (score > 79 ) ? 'B' : 'F';
		System.out.println(grade);
	}

}
