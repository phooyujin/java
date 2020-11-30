package ch03;

import java.io.IOException;

public class Do5 {

	public static void main(String[] args) throws IOException {
		do {
			System.out.println("구구단 숫자를 입력하세요!");
			int num = System.in.read()-'0';
			System.in.read();
			System.in.read();
			if(num==0) break;
			if(num>9 || num<2) {
				System.out.println("구구단 숫자가 아닙니다");
			} else {
				System.out.println("구구단"+ num+"단");
				int i = 1;
				while(i<=9) {
					System.out.println(num+"*"+i+"="+num*i);
					i++;
				}
			}
		}while(true);
	}

}
