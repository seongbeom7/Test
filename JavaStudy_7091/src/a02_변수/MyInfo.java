package a02_변수;

public class MyInfo {

	public static void main(String[] args) {
		
		int studentYear = 2; //4바이트 공간에 1일 넣는다, 그리고 처음 들어가는 수이기때문에 초기화한다라고 표현
		
		double korAvg = 80.0; //소수점을 사용할때는 더블을 사용한다.
		
		boolean maleFemale = true; // 남: true , 여성: false
		
		char name1 = '조';//문자1는 ''를사용, 문자열은""사용
		char name2 = '성';
		char name3 = '범';
		
		char name = '조';
		System.out.println(name);
		name = '성';
		System.out.println(name);
		name = '범';
		System.out.println(name);
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
				
		System.out.print("이름:");
		System.out.println("조성범");
		System.out.print("학년:");
		System.out.println(studentYear);
		System.out.println(korAvg);
		System.out.println(maleFemale);
		System.out.println(name1);
		System.out.println();
		//System.out이란 자바의 콘솔창에 실행, print란 출력해라
		// TODO Auto-generated method stub
		
		System.out.print("이름:");
		System.out.println("조성범2");
		System.out.print("학년:");
		System.out.println(studentYear);
		System.out.println();
		
		System.out.print("이름:");
		System.out.println("조성범3");
		System.out.print("학년:");
		System.out.println(studentYear);
		System.out.println();
		
		System.out.print("이름:");
		System.out.println("조성범4");
		System.out.print("학년:");
		System.out.println(studentYear);
		System.out.println(); 
		
	
	}

}
