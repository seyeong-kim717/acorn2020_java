package test.main;

import test.human.Blood;
import test.human.Men;

public class MainClass13 {
	public static void main(String[] args) {
		MainClass13.useMen(new Men(new Blood("+", "O")));
		
		//Men 객체를 생성해서 참조값을 m1이라는 지역 변수에 담기
		Men m1=new Men(new Blood("+", "A")); //객체는 총 4개 생성! String 객체도 있다.
		//useMen()메소드를 호출하면서 Men객체의 참조값 전달
		useMen(m1);
	}
	public static void useMen(Men m) {
		m.walk();
		m.study();
		m.seeMovie();
	}
}
