package ch03;

import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//number : 1~100
		int cnt = 0;
		int ran = (int)(Math.random()*100) +1;
		do {
			cnt++;
			System.out.println("1~100 숫자를 맞춰 보세요!");
			int num=sc.nextInt();
			if(num == ran)break;
			else if(num>ran)
				System.out.println("작은 수를 입력하세요!");
			else System.out.println("큰 수를 입력하세요!");
		} while (true);
		System.out.println(cnt+"번에 숫자"+ran+"을 맞췄습니다");
		sc.close();
	}

}
