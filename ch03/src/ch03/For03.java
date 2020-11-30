package ch03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		//scanner를 통해서 숫자를 입력받고 해당하는 구구단 출력 for
		//0을 입력하면 종료 아니면 계속 입력 받을 것 do while
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("구구단 출력할 숫자를 입력하세요!");
			int num = sc.nextInt();
			if(num==0) break;
			else if (num<2 || num>9) {
				System.out.println("구구단 숫자가 아닙니다.");
			}
			else {
				System.out.println("구구단 "+num+"단");
				for(int i=1; i<=9; i++) {
					System.out.println(num+"*"+i+"="+num*i);
				}
			}
		} while(true);
		sc.close();
		System.out.println("프로그램 종료!!!!");
	}
}