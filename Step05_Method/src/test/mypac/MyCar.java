package test.mypac;

public class MyCar {
	
		public String name;
		
		public void model() {
			System.out.println("대형 세단 입니다.");
		}
		public void useSome(String name, MyCar mycar) {
			System.out.println("name:"+name);
			mycar.model();
		}
		public void asSome(Radio r,Speaker s) {
		System.out.println("하만카돈 스피커를 내장하고 있어요.");	
		}
		public static int cc=2979;
		
		public void ccc() {
			System.out.println(cc+"배기량을 가지고 있어요.");
		}
}
