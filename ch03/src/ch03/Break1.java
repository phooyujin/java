package ch03;

public class Break1 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=100; i++) {
			sum +=i;
			//50에서 반복문을 빠져나온 것이다! 아니면 무한으로 돈다!
			if(i>50) break;
		}
		System.out.println("합계 :"+sum);
	}
}