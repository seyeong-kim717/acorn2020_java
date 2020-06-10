package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * HashMap<key값의 type, value값의 type>
		 * 대부분 키값은 string 이고 value의 값도 object를 많이 쓴다 여러 타입 섞이기 때문.
		 */
		Map<String, Object> map1=new HashMap<>();//key, value 값
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		/*
		 * value의 Generic 클래스가 Object로 지정되어 있기 때문에
		 * 리턴되는 Object type을 원래 type으로 casting 해야 한다.
		 */
		
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		String addr=(String)map1.get("addr");
	}
}
