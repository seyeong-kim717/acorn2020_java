package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장 할 수 있는 가변 배열 객체 생성
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		//배열의 방의 크기
		int size=nums.size();
		//특정 인덱스 아이템 얻어오기(참조)
		int num1=nums.get(0);
		Integer num2=nums.get(1);
		int num3=nums.get(2);
		//배열의 n번방의 내용 변경
		nums.set(1,40);
		//배열의 n번 방 삭제
		nums.remove(1);
		//배열 삭제
		nums.clear();
	}
}
