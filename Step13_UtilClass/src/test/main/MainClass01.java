package test.main;

import java.util.ArrayList;
/*
 * ArrayList type에는 기본데이터 타입은 저장이 되지 않는다. 참조데이터 타입 가능 하다
 * int시에는 Integer
 */

public class MainClass01 {
	public static void main(String[] args) {
		//String type을 저장 할 수 있는 index로 관리되는 목록(List) 객체
		ArrayList<String> names = new ArrayList<String>();//Generic을 지정해주어야한다. 자바스크립트에서 let names=[]; 와 같다.
		//String type의 참조값 저장하기.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//배열의 방의 크기 얻어오기
		int size=names.size();
		//각각의 방에 저장된 값을 불러오기
		String name1= names.get(0);//0번방
		String name2= names.get(1);//1번방
		String name3= names.get(2);//2번방
		
		//특정 방의 값 수정(덮어쓰기)
		names.set(0, "배주현");//0번방 수정
		
		//특정 인데스 값 삭제(방 자체를 제거하기)
		names.remove(1);//1번방 삭제
		
		//모든 방 깨끗이  삭제
		names.clear();
	
	}
}
