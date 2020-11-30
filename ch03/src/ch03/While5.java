package ch03;

public class While5 {

	public static void main(String[] args) {
		//중첩 while , 예제 구구단 풀이
		System.out.println("구구단");
		int i=1, j=2;
		while (i<=9) {//i가 2일때 j는 2부터 9까지 찍어라
			while (j<=9) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}
			i++;
			j=2; // j를 초기화 하지 않으면 9보다 큰 숫자 이루호 계속 그 값을 보유한다.
			System.out.println();
		}
	}
}