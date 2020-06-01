package test.main;

import test.mypac.MyCar;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  test.mypac 패키지에 다양한 모양의 메소드를 가지는
		 *  클래스를 정의하고
		 *  그 클래스를 이용해서 객체도 생생하고 메소드도 호출해 보세요.
		 */
		MyCar obj1= new MyCar();
		obj1.useSome("콰트로 포르테", new MyCar());
		obj1.ccc();
		obj1.asSome(new Radio(), new Speaker());
		
	}
}
