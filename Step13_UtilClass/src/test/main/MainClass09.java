package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 3명의 회원정보 (번호, 이름 , 주소)를 HashMap객체에 담고
		 * 
		 * HashMap 객체의 참조값을 ArrayList 객체에 순서대로 담아 보세요.
		 */
		Map<String, Object>m1=new HashMap<>();
		m1.put("num", 1);
		m1.put("name", "서현진");
		m1.put("addr", "대치동");
		
		Map<String, Object>m2=new HashMap<>();
		m2.put("num", 2);
		m2.put("name", "조진웅");
		m2.put("addr", "청담동");
		
		Map<String, Object>m3=new HashMap<>();
		m3.put("num", 3);
		m3.put("name", "이정재");
		m3.put("addr", "삼성동");
		
		List<Map<String, Object>> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		for (Map<String, Object> map : list) {
			int num = (int)map.get("num");
			String name = (String)map.get("name");
			String addr = (String)map.get("addr");
			System.out.println(num+" | "+name+" | "+addr);
			
		}
		//참조연습
		List<Map<String, Object>> a=list;
		Map<String, Object> b=list.get(0);
		Object c=list.get(0).get("num");
		Object d=list.get(0).get("name");
		Object e=list.get(0).get("addr");
		int f=(int)list.get(0).get("num");
		String g=(String)list.get(0).get("name");
		String h=(String)list.get(0).get("addr");
		int i=((String)list.get(0).get("addr")).length();
	
	}
}
