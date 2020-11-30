package ch04;

public class Nation {
	public static void main(String[] args) {
		String [] Nation = {"중국","영국","미국","한국","종국","떡국"};
		//일반 for
		for(int i=0; i<Nation.length; i++) {
			System.out.println("nation["+i+"]="+Nation[i]);
		}
		//확장 for
		for(String Na:Nation) {
			System.out.println(Na);
		}
	}
}