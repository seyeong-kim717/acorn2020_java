package test.mypac;

public class Member {
	public String name;
	public int num;
	public String addr;
	
	
	//non static 메소드 정의하기
	public void showInfo() {
		//설계 단계에서의 나의 참조값 this 혼돈의 여지 없다면 생략 가능하다.
		System.out.println(this.num+" | "+this.name+" | "+this.addr);
	}
}
