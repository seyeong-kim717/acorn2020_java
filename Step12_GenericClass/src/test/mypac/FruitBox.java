package test.mypac;
/*
 * class 클래스명 <Generic type>
 * 
 * 	-클래스를 정의할때 Generic type를 지정해서 특정 type을 동적으로 지정할 수 있다.
 */

public class FruitBox<T> { 
	//특정 타입을 Generic(포괄) type으로 지정해 주면 타입이 유동적으로 변경 가능 하다. < >  안에는지정 하고 싶은 문자 삽입.
	//필드
	private T item;
	//메소드
	public void push(T item) {
		this.item=item;
	}
	public T pull() {
		return item;
	}
}
