package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요.");
			}
		});
		Drill d1=()->{//메소드가 하나일때 줄임이 가능하다. 하나 일때만.
			System.out.println("벽에 20mm의 구멍 내기");
		};
		
		useDrill(d1);	//자바 스크립트에서 function(){}와 같다.
		useDrill(()->{//직접 바로 만드는 것도 가능.
			System.out.println("핸드폰에 1mm 구멍내기");
		});
	}
	public static void useDrill(Drill d) {
		d.hole();
		
	}
}
