package ch03;

import java.io.IOException;

public class In1 {

	public static void main(String[] args) throws IOException {
		//System.in은 콘솔로 부터 데이터를 입력 받을 때 사용한다! 아스키 값으로 불러온다!
		System.out.println("숫자를 입력하세요!");
		//System.in은 콘솔로 부터 입력 받은 한 글자만 읽어서 아스키 값으로 저장한다!
		//문자 0은 아스키 값으로 48이므로 -48을 해줘야 정확한 값을 알 수 있다
		int num = System.in.read()-48;
		//int num = System.in.read()-'0'; //아니면''안에 해당 값을 의미하는 숫자를 넣으면 된다
		System.out.println("num : "+num);	
	}
}