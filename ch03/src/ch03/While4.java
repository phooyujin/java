package ch03;
import java.io.IOException;
public class While4 {
	public static void main(String[] args) throws IOException {
		//숫자를 받아서 구구단을 출력한다
		System.out.println("구구단 출력할 숫자를 입력하시오!");
		int num = System.in.read()-'0';
		int i = 1;
		if (num>9 || num<2) {
			System.out.println("구구단 숫자가 아닙니다!!!!!");
		}
		else {
			//구구단 x단을 표현하는 두가지 방법
			//System.out.println("구구단"+ num+"단");
			System.out.printf("구구단%d단\n",num);
			while (i<=9) {
				//구구단을 찍는 두가지 방법!
				//System.out.println(num+"*"+i+"="+num*i);
				System.out.printf("%d * %d=%d\n",num,i,num*i);
				i++;
			}
		}	
		System.out.println("프로그램 종료");
	}
}