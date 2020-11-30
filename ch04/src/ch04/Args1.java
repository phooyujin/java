package ch04;

public class Args1 {
	public static void main(String[] args) {
		//일반 for
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		//확장 for
		for(String arg: args) {
			System.out.println(arg);
		}
	}
}
