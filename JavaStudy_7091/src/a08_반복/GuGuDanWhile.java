package a08_반복;

public class GuGuDanWhile {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 출력
		 *  2 X 1 = 2
		 *  2 X 2 = 4
		 *  2 X 3 = 6
 		 */
		int num = 1;
		int a = 2;
		int result;
		
		while(num < 10) {
			result = a * num  ;
		
			System.out.println(a + "X" + num + "=" + result);
			System.out.println("2 X " + num + " = " + (2*num));
			num++;
		}

	
	}
	

}
