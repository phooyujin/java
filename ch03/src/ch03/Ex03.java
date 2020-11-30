package ch03;

public class Ex03 {

	public static void main(String[] args) {
		//1부터 20까지 정수 중에 2또는 3의 배수가 아닌 수의 합
		int sum1=0;
		int sum2=0;
		for(int i=1; i<=20; i++) {
			if(i%2 !=0 && i%3 !=0) {
				sum1 +=i;
			} else sum2 +=i;
		}
		System.out.println("2또는 3의 배수가 아닌 수의 합: "+sum1);
		System.out.println("2또는 3의 배수의 합: "+sum2);
	}

}
