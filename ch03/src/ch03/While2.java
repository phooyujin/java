package ch03;

public class While2 {

	public static void main(String[] args) {
		//1부터 10까지 합을 구하시오
		int sum =0;
		int i=1;
		while (i<10) {
			sum +=i;
			i++;
		}
		System.out.println("1부터 10까지의 합: "+sum);
	} 

}
