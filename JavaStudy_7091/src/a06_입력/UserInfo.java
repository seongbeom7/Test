package a06_입력;

import java.util.Scanner;

/**
 * 사용자의 이름을 입력해 주세요: 조성범
 * 사용자의 아이디를 입력해 주세요: seongbeom
 * 사용자의 비밀번호를 입력해 주세요: 1234 -> 정수
 * 사용자의 이메일을 입력해 주세여: bum090877@gmail.com -> 문자열
 * 
 * [입력한 사용장의 정보]
 * 이름: 조성범
 * 아이디: seongbeom
 * 비밀번호: 1234
 * 이메일: bum090877@gmail.com
 * @author ITPS
 *
 */
public class UserInfo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("사용자의 이름을 입력해주세요:");
		String name = in.nextLine();
		System.out.print("사용자의 아이디를 입력해주세요:");
		String id = in.nextLine();
		System.out.print("사용자의 비밀번호를 입력해주세요:");
		int password = in.nextInt();
		in.nextLine();
		System.out.print("사용자의 이메일을 입력해주세요:");
		String email = in.nextLine();
		
		
		System.out.println("\r\n[입력한 사용자의 정보]");
		System.out.println( "이름: " + name );
		System.out.println( "아이디: " + id );
		System.out.println( "비밀번호: " + password );
		System.out.println( "이메일: " + email );
		
		
		System.out.println("[입력한 사용자의 정보]\r\n"
				+ "이름: " + name + "\r\n"
				+ "아아디: " + id + "\r\n"
				+ "비밀번호: " + password + "\r\n"
				+ "이메일: " + email + "\r\n");
	}

}
