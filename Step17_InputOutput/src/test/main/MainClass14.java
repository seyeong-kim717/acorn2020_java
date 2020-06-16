package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acorn2020/myFolder/memo.txt");
		try {
			if (!memoFile.exists()) {
				System.out.println("파일이 없어요!");
				return; // 메소드 끝내기
			}
			//파일에서 문자열 읽어들일 객체
			FileReader fr=new FileReader(memoFile);
			while(true) {
				//글자 하나 하나의 코드값을 반복문 돌면서 읽어 들인다
				int code=fr.read();//더이상 읽을 코드가 없으면.
				if(code==-1) {//반복문 탈출
					break;
				}
				//코드값에 해당되는 문자
				char ch=(char)code;
				//콘솔창에 개행 기호 없이 한글자 한글자 출력하기
				System.out.print(ch);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
