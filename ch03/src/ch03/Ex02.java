package ch03;

public class Ex02 {
	public static void main(String [] args) {
		//문제를 작성하시오 int sal 급여를 받아서 
		//sal 0~29000 grade=1
		//30000~39999 grade=2
		//40000~49999 grade=3
		//50000~ grade=4
		//급여는 xxx이고 등급은 xxx이다!
		
		int sal = Integer.parseInt(args[0]);
		String grade=" ";
		switch(sal/10000) {
			case 0 : case 1 : case 2 : grade = "1"; break;
			case 3 : grade = "2"; break;
			case 4 : grade = "3"; break;
			default : grade = "4"; break;	
		}
		System.out.println("급여는 "+sal+"이고 등급은 "+grade+"등급이다");
	}
}