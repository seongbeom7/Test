package a04_연산자;


/**파란색 줄이 가지는 의미
 * 클래스의 사용 설명서
 * @author ITPS
 *
 */

public class Operation2 {
/**
 * 메소드의 사용 설명서
 * @param args
 * 
 * 논리연산자
 * AND: 곱, 
 * true && true -> true (0=false, 1=true) 
 * true && false -> false 
 * false && false -> false
 * 
 * OR: 합,
 * true || true -> true (0이 아니면 전부 1로 봄) 
 * true || false -> true 
 * false || false -> false 
 *  
 * NOT: 반전, 부정
 * !true -> false 
 * !(true || false) -> false 
 * 
 */
	public static void main(String[] args) {
		// 한줄 주석
		/*
		 * 여러줄 주석
		 */
		
		boolean trueFalse = (5>3) && (3<1);
		System.out.println(!trueFalse);
		
	
	}

}
