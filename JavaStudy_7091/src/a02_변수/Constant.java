package a02_변수;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumber;
		final int MAX_NUMBER;
		
		maxNumber = 100;
		MAX_NUMBER = 200;
		
		System.out.print("변수:");
		System.out.println(maxNumber);
		System.out.print("상수");
		System.out.println(MAX_NUMBER);
		
		maxNumber = 200;
		
		System.out.print("변수:");
		System.out.println(maxNumber);
		System.out.print("상수");
		System.out.println(MAX_NUMBER-100);// 상수는 변하지 않는 값
		
		

	}

}
