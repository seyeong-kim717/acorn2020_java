package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		//myutil 클래스의 static 메소드 호출하기
		MyUtil.send();//static이 붙은 메소든 객체 생성 안해도 출력 가능
		
		//MyUtil 클래스의 static 필드에 값 대입하기
		MyUtil.version="1.0";
	}
}
