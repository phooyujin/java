package ch03;

import java.io.IOException;

public class While3 {

	public static void main(String[] args) throws IOException {
		//숫자를 입력 받아서 그 숫자의 횟수만큼 '안녕하세요' 출력
		System.out.println("1부터 9사이의 숫자를 입력하세요");
		int num=System.in.read()-'0';
		int i = 0;
		while (i<num) {
			System.out.println("안녕하세요!");
			i++;
		}
		System.out.println("프로그램 종료");
	}

}
