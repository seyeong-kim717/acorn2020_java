package test.main;

import test.human.Blood;
import test.human.Woman;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 독서를 하고 싶다.
		 *  독서하는 프로그래밍을 해보세요
		 */
		Woman w=new Woman(new Blood("+", "A"));
		w.reading();
		
		Blood b=new Blood("-", "A");
		Woman w1= new Woman(b);
		w1.reading();
		
		new Woman(new Blood("-", "B")).reading();
	}
}
