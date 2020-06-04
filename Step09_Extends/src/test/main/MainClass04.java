package test.main;

import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone 타입의
		SmartPhone p1; //지역변수를 선언만 상태
		SmartPhone p2=null; //빈상태. 지역변수 p2를 만들고 비워둔 상태 (참조값 담기지 않은)
		SmartPhone p3=new SmartPhone(); //지역변수 p3를 만들고 참조값을 넣어둔 상태
		
		//p1은 아직 만들어지지 않았기 때문에 문법이 성립하지 않는다.
		//p1.call();
		
		//p2.call();//참조값이 없는데 데이터를 사용할려고 실행 시키는 상태. 실행시 NullPointerException이 발생
		
		//p3에는 참조값이 들어있으므로 정상적 사용가능.
		
		p3.mobileCall();
	}
}
