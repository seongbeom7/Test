package a02_변수;

public class Conversion {

	public static void main(String[] args) {
		int num = 10;		
		double number = num;
		int age = (int)number;//형변환 방법 -> 다운 캐스팅일경우에는 형변환을 해주어야하고  
							  //업캐스팅일경우에는 묵시적으로 안해주어도 된다. 
		
		System.out.println(age);
		
		//업캐스팅
		//1. 문자->정수
		char c ='A';
		int i_c = c;
		System.out.println(i_c);
		
		//다운캐스팅
		//2. 정수->문자
		int i = 100000;
		char c_i = (char) i;
		System.out.println(c_i);
		
		//업캐스팅
		//정수->실수
		double i_d = i;
		System.out.println(i_d);
		
		double d = 3.14;
		int d_i =  (int) d;
		System.out.println(i_d);
		
	}

}
