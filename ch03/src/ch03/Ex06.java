package ch03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//scanner를 이용하여 year를 입력 받아서
		//4로 나눠지거나 100으로 안 나눠지거나
		//400으로 나눠지면 윤년 아니면 평년으로 출력한다
		//year도 0이면 종료이고 아니면 계속한다
		Scanner sc =new Scanner(System.in);
		System.out.println("년도를 입력하세요!");
		while(true) {
			int year =sc.nextInt(); //scanner를 받는 것임
			if(year==0) break;
			if(year%4==0 && year%100 !=0 || year%400==0) {
				System.out.println(year+"년은 윤년입니다");
			}
			else System.out.println(year+"년은 평년입니다");
		}
	}
}
