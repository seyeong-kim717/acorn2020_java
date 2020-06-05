package test.main;

import test.human.Blood;
import test.human.Men;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적 : 영화를 보고 싶다.
		 * 영화를 보는 프로그래밍의 목적을 달성해 보세요.
		 */
		
		/*
		 * Men 객체를 생성해 보자
		 * 객체 생성은 new 예약어와 함께 class명()이엇지?
		 * 맞다 ~ class명 () 는 행당 클래스의 생성자를 호출하는 거였지?
		 * 객체가 생성이 안되는걸 보니 저런 모양의 생성자가 없네?
		 * Men class의 생성자를 살펴보니
		 * public Men(Blood blood){}이렇게 생겼네?
		 * 생성자의 인자로 Blood type의 참조값을 전달해야되네...
		 */
		Men m=new Men(new Blood("+", "B형"));
		m.seeMovie();
		
		Blood b1 = new Blood("+", "O");
		Men men2 = new Men(b1);
		men2.seeMovie();
		
		new Men(new Blood("-", "A")).seeMovie(); //일회용으로 쓰인다.
		
	}
}
