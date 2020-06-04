package test.main;

import test.auto.Engine;
import test.auto.Koenigsegg;
import test.auto.SportsCar;
import test.auto.Truck;

public class MainClass08 {
	public static void main(String[] args) {
		//Truck 객체를 생성해서 .drive() .dump() 메소드를 호출해 보세요.
		Truck tr=new Truck(new Engine());
		tr.drive();
		tr.dump();
		
		//SportsCar 객체를 생성해서 .drive()메소드를 호출해 보세요.
		SportsCar sc=new SportsCar(new Engine());
		sc.drive();
		Koenigsegg ko=new Koenigsegg(new Engine());
		ko.drive();
		ko.price();
	}
}
