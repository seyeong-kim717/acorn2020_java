package test.main;

import java.util.HashSet;
import java.util.Set;

import test.mypac.Car;

/*
 * HashSet: 데이터를 묶음으로 관리하고 싶을때.  중복된 값은 담기지 못한다.
 * 			중복된값 제거 할때 사용한다.
 * 	-	순서가 없다.
 * 	-  	key값도 없다.
 * 	- 	중복허용 하지 않는다.
 * 	-	어떤 data를 묶음(집합)으로 관리하고자 할 때 사용한다.
 */

public class MainClass12 {
	public static void main(String[] args) {
		// 정수 값을 저장 할 수 있는 HashSet 객체
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		//문자열을 저장할수 있는 HashSet 객체
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("pack");
	
		//Car 객체를 저장 할 수 있는 HashSet 객체
		Set<Car> set3=new HashSet<>();
		set3.add(new Car("그랜저"));
		set3.add(new Car("그랜저"));
		set3.add(new Car("소나타"));
		Car car1=new Car("알티마");
		set3.add(car1);
		set3.add(car1);
		
		
		
	}
}
