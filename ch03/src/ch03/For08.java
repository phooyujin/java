package ch03;

public class For08 {

	public static void main(String[] args) {
		//별 거꾸로 찍기
		for(int i=0; i<=5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("");
			}
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
