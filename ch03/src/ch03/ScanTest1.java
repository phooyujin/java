package ch03;

import java.util.Scanner;

public class ScanTest1 {

	public static void main(String[] args) {
		//scanner는 문자 숫자 모두 가능하고 0을 뺄 필요가 없다! 그리고 cl lf 처리도 필요 없다!
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세용");
		String str = sc.nextLine();
		System.out.println("입력한 문자: "+str);
		System.out.println("숫자를 입력히세요!!");
		int num = sc.nextInt();
		System.out.println("입력한 정수: "+num);
		sc.close();
		
	}

}
