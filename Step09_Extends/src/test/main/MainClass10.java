package test.main;

import test.human.Blood;

public class MainClass10 {
	public static void main(String[] args) {
		//Blood 객체를 생성해서 참조값을 b1이라는 지역변수에 담아 보세요
		Blood b1=new Blood("RH+", "B형");
		b1.getRh();
		b1.getType();
		System.out.println("내 혈액형은 "+b1.getRh()+b1.getType()+" 입니다.");
		
		Blood b2=new Blood("+", "O");
		String result1=b1.getRh();//"+"
		String result2=b1.getType();//"B"
		
		String result3=b2.getRh();//"+"
		String result4=b2.getType();//"O"
	}
}
