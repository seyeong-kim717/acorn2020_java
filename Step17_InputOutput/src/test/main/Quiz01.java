package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 문자열 한줄을 입력 받은 다음
		 * c:/acorn2020/myFolder/quiz.txt 파일을 만들어서 해당 파일에 문자열을 저장해 보세요.
		 */
		File QuizFile=new File("c:/acorn2020/myFolder/quiz.txt");
		System.out.println("저장 문자열 입력!");
		Scanner sc=new Scanner(System.in);
		String se=sc.nextLine();
		
		
		try {
			boolean isExist=QuizFile.exists();
			if(!isExist) {
			QuizFile.createNewFile();
			}
			FileWriter fw=new FileWriter(QuizFile,true);//append 사용시 true사용시 내용을 이어 붙힐수 있다.
			fw.append(se);
			fw.append("\r\n");
//			fw.flush();
			fw.close();//파일이 생성된다. 자동 flush 된다.
			System.out.println("문자열을 저장 했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
