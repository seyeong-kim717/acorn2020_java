package test.mypac;
/*
 * [클래스의 용도]
 * 
 * 1.객체의 설계도 역활을 한다.
 * 2.데이터 type의 역활을 한다.
 * 3. static 필드나 static 메소드를 가지고 있는 역활을 한다.
 * 
 * 객체는 기능과 데이터의 저장소 기능과 속성.
 * 객체는 필드와 메소드로 이루어져 있다 
 * 기능은 메소드 필드는 저장소
 */
public class Car {
	//자동차의 이름을 저장 할 필드
	public String name;
	
	//달리는 메소드
	public void drive() {
		System.out.println("부릉 부릉 달려요~");
	}

}
