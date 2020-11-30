package ch03;

public class Do3 {

	public static void main(String[] args) {
		//1~9까지 구구단 찍기
		System.out.println("구구단");
		int i=1, j=2;
		do {
			do {
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			} while(j<9);
				i++;
				j=2;
				System.out.println("");
		} while(i<=9);
		System.out.println("구구단 종료!");
	} 
}