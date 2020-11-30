package ch04;

public class Arr3 {

	public static void main(String[] args) {
		int [] i1 = new int[3];
		i1[0]=7; i1[1]=12; i1[2]=45;
		for(int i=0; i<i1.length; i++) {
			System.out.println(i1[i]);
		}
		System.out.println("==================");
		//int [] i2 = new int[4];
		//i2[0]=56; i2[1]=78; i2[2]=23; i2[3]=15;
		int [] i2 = {56,78,23,15}; //좀 더 쉽게 선언하고 배열하는 방법!
		for(int i:i2) {
			System.out.println(i);
		}
		System.out.println("==================");
		int [] i3 = new int[] {100,200,300};
		//일반 for
		for(int i=0; i<i3.length; i++) {
			System.out.println(i3[i]);
		}
		System.out.println("==================");
		int [] i4 = {12,45,56,23};
		//확장 for
		for(int i : i4) {
			System.out.println(i);
		}
	}

}
