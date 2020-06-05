package test.main;

import test.mypac.Sword;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//여러분이 직접 클래스를 만들고 객체를 생성해서
		//아래의 useWeapon() 메소드를 호출해 보세요
		Sword s1=new Sword();
		useWeapon(s1);
		s1.die();
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
