package test.mypac;

public class Phone extends Object {//extends Object가 생략 되어 있고 생략 가능 하다.
	//생성자
	public Phone() {
		System.out.println("Phone() 생성자 호출됨");
	}
	//전화 거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
