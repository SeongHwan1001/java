import java.util.LinkedList;

interface A {
	void func01();
}
class B implements A{
	@Override
	public void func01() {
		System.out.println("B func01 call");
	}
	
	void func02() {
		System.out.println("B func02 call");
	}
}
class C implements A {
	@Override
	public void func01() {
		System.out.println("C func01 call");
	}
	void func03() {
		System.out.println("C func03 call");
	}
}

class D {
	void func01(LinkedList<A> list) {
		
		System.out.println("D func01 call");
		
		for (A item : list) {
			item.func01();
		}
		
		// 억지로 B 타입인 것을 알기 때문에 강제로 캐스팅이 가능한 것이다.
		((B)list.get(0)).func02(); // 이렇게 해서 func02를 캐스팅해서 사용 할 수 있다.
		
		// 업캐스팅을 사용 할 때 자기 타입을 자기가 찾아가기 위해 사용한다.
		// 이렇게 사용한다는 형태 정도는 알아줘야 한다.
		// 연기에 온갖 문법이 들어가 있다. 복합적으로 이해하고 넘어가야 된다능....
		for (A item : list) {
			if (item instanceof B) {		// list.get(0)이 B타입입니까?
				B b = (B) item;
				b.func02();
			}
			if (item instanceof C) {		// list.get(0)이 C타입입니까?
				C c = (C) item;
				c.func03();
			}
		}
	}
}
// 보통 이렇게 직접 짜기는 않고 남이 짜놓은걸 사용한다. 이런 구조가 있다는 것을 알아두면 좋다.
public class Ex02 {
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();
		list.add(new B());
		list.add(new C());
		list.add(new B());
		list.add(new C());
		
		D d = new D(); 	// D 객체 생성
		d.func01(list);
		
		A a1 = new B();
		// a1.func02(); // 실제로 문법으로는 사용할 수 없지만 메모리에는 존재한다.	
		((B)a1).func02(); // 메모리에 존재하기 때문에 억지로 캐스팅해서 사용 할 수 있다.
	}
}
