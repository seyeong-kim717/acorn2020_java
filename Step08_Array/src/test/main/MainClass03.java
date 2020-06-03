package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//String type을 담을수 있는 방 3개짜리 빈 배열객체를 만들어서 참조값을 지역변수
		//name에 담기
		String[] names = {null, null, null};
		//각각의 방에 순서대로 String type에 담기.
		names[0]="김구라";
		names[1]="서현진";
		names[2]="배주현";
		String[] names2 = new String[3];
		names2[0]="이정재";
		names2[1]="황정민";
		names2[2]="유지태";
	}
}