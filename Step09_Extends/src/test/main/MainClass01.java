package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		
		//Phone 클래스로 객체 생성해서 참조값을 지역변수에 담기
		Phone p1=new Phone(); //하나의 객체는 여려개의 타입을 가짐 다형성.
		Object p2=new Phone();
		
		//HandPhone 클래스로 객체 생성해서 참조값을 지역변수에 담기
		HandPhone p3=new HandPhone();
		Phone p4=new HandPhone();
		Object p5=new HandPhone();
		
		//이미 만들어진 객체의 참조값을 다른 type로 받아보기
		Phone p6=p3;
		Object p7=p3;
//		String str=p3; // 오류! 타입이 다름.!
		 
		Object p8=new HandPhone();
		HandPhone p9=(HandPhone)p8;
		p9.mobileCall();
		
	}
}
