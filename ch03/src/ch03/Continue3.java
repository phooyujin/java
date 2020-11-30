package ch03;

public class Continue3 {

	public static void main(String[] args) {
		int i=1;
		outer: for(int k=1; k<=9; k++) {
			for(int j=1; j<=9; j++) {
				System.out.println("난 반복");
				i++;
				if(i>3) continue outer;
				System.out.println("난 반복 안 되나?");
			}
			i=1;
			System.out.println("----난 바깥");
		}
	}

}
