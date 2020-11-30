package ch03;

public class For01 {

	public static void main(String[] args) {
		for(int i=0; i<=10;) {
			System.out.println(i+"\t");
			i++;
		}
		System.out.println();
		for(int i=0; i<=10;i+=3) {
			System.out.println(i+"\t");
		}
		System.out.println();
		for(int i=1; i<=10; i*=2) {
			System.out.println(i+"\t");
		}
		System.out.println();
		for(int i=10; i>0; i--) {
			System.out.println(i+"\t");
		}
		System.out.println();
	}

}
