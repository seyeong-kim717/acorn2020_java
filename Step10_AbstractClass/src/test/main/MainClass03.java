package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		//Zoo 클래스에 있는 getMonkey()메소드를 호출해서
		//리턴되는 값을 m1이라는 지역변수에 담아 보세요
		Zoo z= new Zoo();
		//inner class type Monkey
		Monkey m1=z.getMonkey();
		m1.say();
		
		Tiger t1=z.getTiger();
		t1.say();

		
	}
}
