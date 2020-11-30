package ch03;

public class MathTest1 {

	public static void main(String[] args) {
		//Math.random() 0보다 크거나 같고 1보다 작은 실수
		System.out.println(Math.random());
		//0보다 크거나 같고 100보다 작거나 같은 실수
		System.out.println(Math.random()*100);
		//0보다 크거나 같으나 항상 0이 나온다 소수점을 버리니까 0*100해서 0이 나온다!
		System.out.println((int)Math.random()*100);
		//0보다 크거나 같고 100보다 작은 정수 0~99까지 정수
		System.out.println((int)(Math.random()*100));
		//1~100
		System.out.println((int)(Math.random()*100));
	}

}
