package ch03;

import java.io.IOException;

public class Do4 {

	public static void main(String[] args) throws IOException {
		// 짝수를 입력하세요!
		int num = 0;
		do {
			System.out.println("짝수를 입력하세요!");
			num = System.in.read()-'0';
			System.out.println("num= "+num);
		} while(num%2 != 0); 
		System.out.println("입력한 짝수: "+num);
	}
}