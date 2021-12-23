package a08_반복;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		//2X1 ~ 9x9
		/*
		 * [2단]
		 * 2X2=2
		 * ....
		 * 2x9=18
		 * [3단]
		 * 3X1=3
		 * ....
		 * 3X9=27
		 * 
		 * ....
		 * [9단]
		 *...
		 *9X9 = 81
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("시작 단수: ");
		int startDan = input.nextInt();
		input.nextLine();
		System.out.print("마지막 단수: ");
		int endDan = input.nextInt();
		input.nextLine();
		
		for(int a = startDan; a < (endDan + 1); a++ ) {
			System.out.println("["+ a + "단]");
			for(int b = 1; b<10; b++) {
				System.out.println(a + " X " + b + " = " + a*b  );
			}
			System.out.println();
		}
		
		
	}

}
