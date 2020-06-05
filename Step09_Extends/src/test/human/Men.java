package test.human;

public class Men extends Person {

	public Men(Blood blood) {
		super(blood); //부모생성자에 필요한 값을 전달 한다.
		// TODO Auto-generated constructor stub
	}
	public void seeMovie() {
		System.out.println("영화를 봐요");
	}
}