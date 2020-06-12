package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Map<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		/*
		 * 검색할 단어를 입력하세요: house
		 * 
		 * house의 뜻은 집입니다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("검색 단어 입력.");
		String str=scan.nextLine();//문자열 입력 받기.
		//Map 객체에서 입력한 문자열로 저장된 값을 읽어 와 보기.
		String mean=dic.get(str);
		if (mean == null) {//존재하지 않으면
			System.out.println(str+"는 목록에 없어요");
		}else{
			//출력 할  문자열 구성하기
			String line=str+"의 뜻은"+mean+"입니다.";
			//출력하기
			System.out.println(line);
		}
		
	}
}
