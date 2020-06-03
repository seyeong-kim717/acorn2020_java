package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  1.Scanner 객체를 이용해서 5번 입력 받는다.
		 *    입력받은 문자열은 차례대로 배열에 저장 되어야 한다.
		 *    모두 다 입력 받은후 for문을 이용해서 배열에 저장된
		 *    모든 문자열을 콘솔창에 순서대로 출력하는 코드를 출력해 보세요
		 *  
		 *  2. Random 객체를 이용해서 로또 번호 6개를 랜덤하게 얻어내서 
		 *     배열에 저장한다.
		 *     모두 다 저장이 되면 for문을 잉요해서 배열에 저장된 모든 로또번호를 
		 *     콘솔창에 순서대로 출력하는 코드를 작성해 보세요.
		 */
//		Random[] lotto= new Random[6];
//		lotto[0]=new Random();
//		lotto[1]=new Random();
//		lotto[2]=new Random();
//		lotto[3]=new Random();
//		lotto[4]=new Random();
//		lotto[5]=new Random();
//		for (int i = 0; i < lotto.length; i++) {
//			int lottonum=lotto[i].nextInt(45)+1;
//			System.out.println(lottonum);
//		}
		//Scanner 객체를 생성해서 참조값을 지역변수에 담기
		
		
		String[] sc= new String[5]; //문자열 5개를 담을수 있는 배열 객체를 생성해서 참조값을 지역변수에 담기.
		Scanner scan=new Scanner(System.in); //스캐너 객체 생성. scan= 메인메소드 안에서 선언된 지역변수
		for (int i = 0; i < sc.length; i++) {//5번 반복을 위해 for문 생성.
			System.out.println("문자열 입력 :");//콘솔창을 열어준다.
			String str=scan.nextLine();//문자열을 입력 받는다. str= for문 안에서만 사용가능한 지역변수.
			sc[i] = str; //입력받은 문자열의 참조값을 배열에 순서대로 저장하기.
		}
		for (int i = 0; i < sc.length; i++) {
			//i번째 방에 있는 String 객체의 참조값을 불러온다.
			String tmp=sc[i];
			//콘솔에 출력한다.
			System.out.println(tmp);
		}
			
		int [] lotto = new int[6];
		Random r=new Random();
		System.out.println("로또 번호는 :");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
		}
	}
}
