package ch03;

public class For06 {
	//별 거꾸로 찍기!!
	public static void main(String[] args) {
		for (int i=0; i<=5; i++) {
			for(int j=5; i<=j; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}