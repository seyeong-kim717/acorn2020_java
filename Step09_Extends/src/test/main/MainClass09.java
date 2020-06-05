package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.Koenigsegg;

public class MainClass09 {
	public static void main(String[] args) {
		//여러분들의 Car 클래스를 상속받아서 만든 클래스로 객체를 생성해서
		//아래 useCar() 메소드를 호출해 보세요.
		Koenigsegg ko=new Koenigsegg(new Engine());
		useCar(ko);
		ko.price();
		MainClass09.useCar(ko);
		//Koenigsegg ko=new Koenigsegg(new Engine());
		//Car ko=new Koenigsegg(new Engine()); 두개의 값은 같다 다형성.
		
	}
	public static void useCar(Car car) {//스테틱 메소드.! 클래스.useCar(); 로 호출.
		car.drive();
	}
}
