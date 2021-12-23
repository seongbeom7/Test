package a07_조건;

public class IfScore {

	public static void main(String[] args) {
		int score = 100;
		
		/* 만약에 스코어가 
		 * 90 이상이면 A 등급입니다.
		 * 80 이상이면 B 등급입니다.
		 * 70 이상이면 C 등급입니다.
		 * 60 이상이면 D 등급입니다.
		 * 나머지는 전부 F등급입니다.
		 * 
		 * 100 초과거나 0미만이면 계산 할수 업는 점수 입니다.
		 */
		
		if( score > 100) {
			System.out.println(" 계산할 수 없는 점수입니다.");
		}else if ( score >= 90 ) {
			System.out.println(" A 등급입니다.");
		}else if ( score >= 80 ) {
			System.out.println(" B 등급입니다.");
		}else if ( score >= 70 ) {
			System.out.println(" c 등급입니다.");
		}else if ( score >= 60 ) {
			System.out.println(" d 등급입니다.");
		}else if ( score > 0 && score <60) {
			System.out.println(" f등급입니다");
		}else {
			System.out.println("계산할수 없는 점수입니다.");
		}
		
		if( score > 100 || score <0) {
			System.out.println(" 계산할 수 없는 점수입니다.");
		}else if ( score >= 90 ) {
			System.out.println(" A 등급입니다.");
		}else if ( score >= 80 ) {
			System.out.println(" B 등급입니다.");
		}else if ( score >= 70 ) {
			System.out.println(" c 등급입니다.");
		}else if ( score >= 60 ) {
			System.out.println(" d 등급입니다.");
		}else if ( score < 60) {
			System.out.println(" f등급입니다");
		}else {
			System.out.println("계산할수 없는 점수입니다.");
		}
		
		
	
	
	}

}
