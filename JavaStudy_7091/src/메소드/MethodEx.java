package 메소드;

public class MethodEx {
	
	//매개변수x, 반환값x
	public static void printInfo() {
		System.out.println("조");
		System.out.println("성");
		System.out.println("범");
		System.out.println("입");
		System.out.println("니");
		System.out.println("다");
		
	}
	//매개변수o, 반환값x
	public static void printName(String name) {
		System.out.println("이름: " + name);
	}
	
	//매개변수x, 반환값o
	public static String getName() {
		String name = "조성범";
		return name;
	}
	
	//매개변수o, 반환값o
	public static String transferName(String name) {
		String tName = name +"님";
		return tName;
	}
	
	public static String transferName2(String name, int number) {
		return number +"번 고객: " + name;
	}
	
	public static void main(String[] args) {
		printInfo();
		
		printName("조성범");
		String name = ("조성범");
		printName(name);
		
		System.out.println("프로그램 종료");
	
		String name2 = getName();
		System.out.println(name2);
		System.out.println(getName());
		
		String name3 = transferName("조성범");
		System.out.println(name3);
		System.out.println(name3);
	
		System.out.println(transferName2("조성범", 1));
	}

}
