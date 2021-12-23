package a07_조건;

public class SwitchCase {

	public static void main(String[] args) {
		char select = 'g';
		
		switch(select) {
			case 'A' : 
				System.out.println("A");
				break;
			case 'B' : 
				System.out.println("B");
				break;
			case 'C' : 
				System.out.println("C");
				break;
			case 'D' : 
				System.out.println("D");
				break;
			case 'F' : 
				System.out.println("F");
				break;
			default:
				System.out.println("잘못된 성적");//기본값을 설정 if에서 else와 비슷하게 사용
		}
		
		
	}//break를 사용하지 않으면 그이후에 모두 실행된다.

}
