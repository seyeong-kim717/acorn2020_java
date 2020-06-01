package test.main;

import test.mypac.Marine;

public class MarinClass07 {
	public static void main(String[] args) {
		/*
		 * Marine 객체를 생성해서 참조값을 m1이라는 지역변수에 담아보세요
		 */
		Marine m1 = new Marine();
		
		m1.move();
		m1.attack();
		m1.showEnergy();
		System.out.println("--- m1 ---");
		
		Marine m2 = new Marine();
		m2.move();
		m2.attack();
		m2.showEnergy();
		System.out.println("--- m2 ---");
		
		//Marine의 공격력을 올려보자
		
		Marine.attackPower += 2;//(모든 marine 객체의 공격력에 영향을 미친다.)
		m1.attack();
		m2.attack();
		
		//m1의 에너지 감소(m2의 에너지엔 영향을 주지 않는다.)
		m1.energy -=10;
		m1.showEnergy();
		m2.showEnergy();
	}
}
