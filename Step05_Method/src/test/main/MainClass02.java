package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		MyObject obj1=new MyObject();
		Car a = obj1.getCar();  //a,b,c 타입은 같지만 id값은 다르다.
		Car b = obj1.getCar();
		Car c = obj1.getCar();
	
		
		//지역변수에 담긴 객체 사용하기
		a.drive();
		b.drive();
		c.drive();
	}

}
