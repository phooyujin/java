package ch04;

public class Total1 {
	public static void main(String[] args) {
		//합계와 평균을 구하세요
		int [] a = {85,90,75,100,95};
		int sum=0;
		//일반 for
		for(int i=0; i<a.length; i++) {
			sum +=a[i];
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum/a.length);
	}
}
