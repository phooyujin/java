package ch03;

public class Do1 {

	public static void main(String[] args) {
		//do while과 while의 차이점은 do는 먼저 실행한다
		//while은 true와 false를 확인한다
		int i=0;
		do {
			System.out.println("안녕하세요!");
			i++;
		} while(i<5);
	}
}