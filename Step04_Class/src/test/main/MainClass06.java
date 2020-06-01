package test.main;

import test.mypac.Box;
import test.mypac.Car;
import test.mypac.Member;
import test.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		//new Box().
		System.out.println("main 메소드가 시작 되었습니다.");
		Member a=Box.mem;//null
		Rect b=Box.rect;//null
		
		Car c=Box.car;//참조값이 들어있다.
		c.drive();// 메소드가 호출 가능.
		
		//아래와 같이 사용 할 수도 있다.
		Box.car.drive();
		
		//a.showInfo();//Member type a가 null이므로 NullPointerException 발생
		//b.getArea();//Rect type b가 null이므로 NullPointerException 발생
		
	}
}
