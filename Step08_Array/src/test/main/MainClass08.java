package test.main;

import java.util.Random;

/*	
 * 	1.
 * 	cherry, apple, banana, melon, 7
 * 
 * 	5개의 문자열중에서 하나가 랜덤하게 출력되게 해 보세요.
 */

public class MainClass08 {
	public static void main(String[] args) {
		//랜덤하게 출력할 문자열을 미리 배열에 담아 놓는다.
		String[] sc = {"cherry", "apple", "banana", "melon", "7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//0~4사이의 랜덤한 정수 얻어내기
		int a = ran.nextInt(5);
		System.out.println(sc[a]);
	}
}
