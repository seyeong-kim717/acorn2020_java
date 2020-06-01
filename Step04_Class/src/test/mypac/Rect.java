package test.mypac;

//사각형의 정보를 담을 수 있는 Rect 클래스 
public class Rect {
	//non static 필드
	public int width; // 폭
	public int height; //높이
	
	//void는 리턴값이 없을때 아무것도 받지 못한다.
	//사각형의 면적을 리턴해주는 non static 메소드
	public int getArea() {
		int area=this.width * this.height;
		return area;
	}
}
