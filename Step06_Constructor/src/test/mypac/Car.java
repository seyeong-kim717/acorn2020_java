package test.mypac;

public class Car {
	//필드
	public String name;
	
	//생성자 String type을 전달받는다.
	public Car(String name) {
		//생성자의 인자로 전달 받은 값을 필드에 저장하기
		this.name=name;
	}

	//메소드
	public void drive() {
		System.out.println(this.name+"이 달려요");
	}
}
