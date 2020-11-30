package ch04;

public class Arr1 {
	public static void main(String[] args) {
		int [] k1; //배열 선언
		k1 = new int[5];//배열 생성
		int k2 [] =new int[5];
		int [] i1 =new int[5]; //선언과 생성을 동시에 하는 것.
		k1[0]=34; k1[1]=24; k1[2]=45; k1[3]=12; k1[4]=77;
		for(int i=0; i<5; i++) {
			System.out.println(i+"번째 배열의 값:" +k1[i]+"\t");
		}
	}
}
