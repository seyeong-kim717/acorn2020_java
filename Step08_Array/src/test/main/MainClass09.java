package test.main;

import java.util.Random;

/*
 *  5개의 문자열 중에서 3개가 한줄에 한버에 랜덤하게 출력되게 해보세요
 *  ex) cherry | apple | cherry
 *  7 | apple | melon
 *  7 | 7 | 7
 */

public class MainClass09 {
	public static void main(String[] args) {
		String[] sc = {"cherry", "apple", "banana", "melon", "7"};	
		Random ran=new Random();
		//랜덤하게 얻어낸 3개의 정수를 저장할 배열
		int[] nums=new int[3];
		for (int i = 0; i < 3; i++) {	
			//0~4사이의 랜덤한 정수 3개 얻어내기
			int a=ran.nextInt(5);
			nums[i]=a; //배열에 저장한다.
		}
		//랜덤한 정수 3개 참조
		int one=nums[0];
		int two=nums[1];
		int three=nums[2];
		//출력할 문자열 구성하기
		String line=sc[one]+" | "+sc[two]+" | "+sc[three] ;
		System.out.println(line);
	}
}
