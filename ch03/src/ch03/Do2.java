package ch03;

import java.io.IOException;

public class Do2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("구구단 숫자를 입력하세요");
		int num = System.in.read()-'0';
		System.out.printf("구구단 %d단\n",num);
		int i=1;
		do {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}while (i<=9);
	}

}
