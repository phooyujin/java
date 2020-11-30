package ch03;

public class Ex04 {
	public static void main(String[] args) {
		//1~10까지 합계와 그 합계를 더한 총계를 구하라
		int sum=0;
		int totalSum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.println(i+"일 때 sum= "+sum);
			totalSum +=sum;
		}
		System.out.println("합계: "+sum);
		System.out.println("총계: "+totalSum);
	}
}
