package a05_문자열;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "조성범";
		System.out.println("안녕하세요." + name + " 입니다.");
		System.out.println(1 + "안녕하세요.");
	//숫자가 자동으로 문자열로 업캐스팅됨
		System.out.println(1 + 1 + "안녕하세요.");
		System.out.println(1 + 'a' + "안녕하세요." + 1 + 1);
	//a가 정수로 캐스팅됨 
		System.out.println(1 + ('a' + "안녕하세요.") + (1 + 1));

	}

}
