package ch03;

public class For04 {
	public static void main(String[] args) {
		System.out.println("구구단을 출력하시오");
		System.out.println("==============");
		for(int i=2; i<=9; i++) {
			System.out.print(i+"단\t\t");
		}
		System.out.println();
			for(int i=0; i<=14*9; i++) {
				System.out.print("=");
			}
			System.out.println();
			for(int i=1; i<=9; i++) {
				for(int j=2; j<=9; j++) {
					System.out.printf("%d * %d = %d\t",i,j,i*j);
				}
				System.out.println();
			}
	}
}