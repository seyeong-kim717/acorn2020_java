package test.mypac;

public class MyWeapon extends Weapon {
	//상속받은 Weapon 클래스의 추상 메소드를 강제로 오버라이드 해야 한다.
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("레이저총을 쏩니다.");
	}

}
