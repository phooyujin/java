package ch03;

public class Continue1 {

	public static void main(String[] args) {
		int i=1;
		for (int j=1; j<=9; j++) {
			System.out.println("난 반복");
			i++;
			if(i>3) continue;
			System.out.println("난 반복 안 되나?");
		}
	}

}
