package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		MemberDto m1=new MemberDto();
		m1.setNum(1);
		m1.setName("김구라");
		m1.setAddr("노량진");
		
		//인자로 필드에 저장 할 생성자를 이용해서 객체를 생성 한 경우
		MemberDto m2=new MemberDto(2, "해골", "행신동");
		
		//위에서 생성한 객체의 참조값을 List 객체에 담아 보세요
		List<MemberDto> li=new ArrayList<>();
		li.add(m1);
		li.add(m2);
		
		//for문을 이용해서 List객체에 담긴 MemberDto객체를 순서대로 참조해서
		//아래와 같은 형식으로 출력해 보세요
		
		for (MemberDto mem : li) {
			String line=mem.getNum()+"|"+mem.getName()+"|"+mem.getAddr();
			System.out.println(line);
		}
		//참조테스트
		List<MemberDto> a=li;
		
		MemberDto b= li.get(0);
		
		int c = li.get(0).getNum();
		
		String d=li.get(0).getName();
		
		String e=li.get(0).getAddr();
		
		int f = li.get(0).getName().length();
		
	//li= List<MemberDto>, li.get(0)=MemberDto
	//li.get(0).getName() =String type ,  
	//li.get(0).getName().length(); =int type 을 반환 한다.
		
		
	}
}
