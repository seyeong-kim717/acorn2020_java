package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		//문자열 저장할 파일을 만들기 위한 File 객체
		File memoFile=new File("c:/acorn2020/myFolder/memo.txt");
		
		//실제로 파일이 존재하는지 여부
		boolean isExist=memoFile.exists();
		if(!isExist) {
			try {//존재 하지 않으면
				//파일을 실제로 만든다.
				memoFile.createNewFile();
			
			//파일에 문자열을 출력할 객체
			FileWriter fw=new FileWriter(memoFile);
			fw.write("하나");
			fw.write("\r\n");// 개행기호
			fw.write("두울");
			fw.write("\r\n");
			fw.write("세엣");
			fw.flush();
			fw.close();//파일이 생성된다.
			
			
		}catch (IOException e) {

				e.printStackTrace();
		}
	}
}
}
