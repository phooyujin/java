package ch04;

public class Arr2 {
	public static void main(String[] args) {
		//정수 5개 보관하는 배열 arr을 만들고
		//숫자 56,67,78,45,23을 각각 대입하고 값을 출력하시오.
		int [] arr = new int[5];
		arr[0]=56; arr[1]=67; arr[2]=78; arr[3]=45; arr[4]=23;
		for(int i=0; i<5; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		//배열명.length가 배열의 갯수이다. length를 쓰면 알아서 기억해준다.
		System.out.println("배열의 갯수: "+arr.length);
		System.out.println("==========");
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
	}
}
