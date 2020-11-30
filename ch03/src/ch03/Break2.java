package ch03;

public class Break2 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println("안쪽 반복문");
				if(j>4) break;
			}
			System.out.println("바깥쪽 반복문");
		}
	}
}
