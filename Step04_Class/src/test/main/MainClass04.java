package test.main;

import test.mypac.Member;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  1, 김구라, 노량진
		 *  
		 *  이라는 int, String, String type의 값을
		 *  
		 *  객체의 필드에 저장하는 프로그래밍 해보세요
		 *  
		 *  단 객체를 생성할 클래스의 이름은 Member로 작성 하세요.
		 */
		Member mem = new Member();
		mem.num=1;
		mem.name="김구라";
		mem.addr="노량진";
		
		Member mem2 = new Member();
		mem2.num=2;
		mem2.name="해골";
		mem2.addr="행신동";
		
		//Member 객체의 메소드 호출하기
		mem.showInfo();
		mem2.showInfo();
		//',' 사용했을때 char로 인식 하여서 숫자와 산술연산 하게 됨."" 사용.
		System.out.println(mem.num+","+mem.name+","+mem.addr);
		System.out.println(mem2.num+","+mem2.name+","+mem2.addr);
		
	}
}
