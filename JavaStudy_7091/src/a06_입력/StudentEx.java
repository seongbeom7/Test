package a06_입력;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int kr;
		int eng;
		int math;
		double avg;
		int total;
		char grade;
		
		System.out.print("학생을 이름을 입력해 주세요: ");
		name = in.nextLine();
		System.out.print("학생의 국어성적을 입력해 주세요: ");
		kr = in.nextInt();
		in.nextLine();
		System.out.print("학생의 국어성적을 입력해 주세요: ");
		eng = in.nextInt();
		in.nextLine();
		System.out.print("학생의 국어성적을 입력해 주세요: ");
		math = in.nextInt();
		in.nextLine();
		
		total = kr + eng + math;
		avg = total / 3.0;// 더블형으로 나누어 줘야 소수점이 나타남
		grade = avg>89 ? 'A' : avg > 79? 'B' :  avg > 69? 'C' : avg > 59? 'D' : 'F'	;	
		
		//avg = 평균
		//total = 총점
		//grade = 삼항연산자. 
		//avg 90 이상이면 A등급 80 -> B 70 -> c 60-> D 나머지는 다 F
		//[학생 성적 정보]
		/*
		 * 국어: 80
		 * 영어: 85
		 * 수학: 90
		 * 토탈: 255
		 * 평균: 85
		 * 등급: B
		 */
		
		System.out.println("국어: " + kr);
		System.out.println("영어: " + eng);	
		System.out.println("수학: " + math);	
		System.out.println("토탈: " + (kr + eng + math));
		System.out.println("평균: " + ((kr + eng + math)/3));
		
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);	
		System.out.println("등급: " + grade);
	}

}
