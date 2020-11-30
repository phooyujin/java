package ch03;

public class For02 {

	public static void main(String[] args) {
		// 1~100까지 합을 구해보셈용
		//홀수합
		//짝수
		int sum=0; int oddSum=0; int evenSum=0;
		for(int i=1; i<=100; i++) {
			sum +=i;
			if(i%2==1) oddSum +=i;
			else evenSum +=i;
		}
		System.out.println("1부터 100까지 합: "+sum);
		System.out.println("1부터 100까지 홀수합: "+oddSum);
		System.out.println("1부터 100까지 짝수합: "+evenSum);
	}
}