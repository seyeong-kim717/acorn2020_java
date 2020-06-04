package test.auto;

public class Koenigsegg extends Car {

	public Koenigsegg(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
		System.out.println("코닉세그는 하이퍼 카여서 엄청 빨라요!");
	}
	public void price() {
		System.out.println("가격은 40억이나 해요!!");
	}
}
