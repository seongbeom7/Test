package a08_반복;

public class ContinueBreak {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				continue;//continue를 만나게되면 밑은 실행이 되지않고 위올라가 다시 반복문 실행
				
			}
			if(i == 81) {
				break;//반복문 빠져나가기
			}
			System.out.println(i);
		}

	}

}
