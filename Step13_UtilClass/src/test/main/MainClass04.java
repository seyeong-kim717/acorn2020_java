package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1.Car type을 저장할수 있는 ArrayList 객체를 생성해서
		//참조값을 List 인터페이스 type 지역변수 cars에 담아 보세요
		
		//2. Car 객체를(3개)를 생성해서 List객체에 저장해 보세요
		
		List<Car> cars=new ArrayList<>();
		
//		cars.add(new Car() {
//			public void drive() {
//				System.out.println("달려봐");
//			} Car클래스에 필드와 생성자 추가 전에 드라이브 넣어봤다. 
//		});
		cars.add(new Car("람보르기니"));
		cars.add(new Car("코닉세그"));
		Car c1=new Car("부가티");
		cars.add(c1);
		
		//3. 반복문 for문을 이용해서  List객체에 저장된 모든 Car 객체의 drive()메소드를 
		//순서대로 호출해 보세요
		for (int i = 0; i < cars.size(); i++) {
			Car tmp=cars.get(i);
			tmp.drive();
		}
		System.out.println("확장 for 문 사용시");
		for (Car car : cars) {
			car.drive();
		}
		
		
	}
}
