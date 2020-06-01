package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code를 작성해 보세요
		
		MyObject obj=new MyObject();
		obj.walk();
		obj.getGreeting();
		obj.getNumber();
		
		//메소드가 리턴해주는 데이터를 지역변수에 담아보기
		int a = obj.getNumber();
		String b = obj.getGreeting();
	}
}
