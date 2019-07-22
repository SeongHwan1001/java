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
		
		// ������ B Ÿ���� ���� �˱� ������ ������ ĳ������ ������ ���̴�.
		((B)list.get(0)).func02(); // �̷��� �ؼ� func02�� ĳ�����ؼ� ��� �� �� �ִ�.
		
		// ��ĳ������ ��� �� �� �ڱ� Ÿ���� �ڱⰡ ã�ư��� ���� ����Ѵ�.
		// �̷��� ����Ѵٴ� ���� ������ �˾���� �Ѵ�.
		// ���⿡ �°� ������ �� �ִ�. ���������� �����ϰ� �Ѿ�� �ȴٴ�....
		for (A item : list) {
			if (item instanceof B) {		// list.get(0)�� BŸ���Դϱ�?
				B b = (B) item;
				b.func02();
			}
			if (item instanceof C) {		// list.get(0)�� CŸ���Դϱ�?
				C c = (C) item;
				c.func03();
			}
		}
	}
}
// ���� �̷��� ���� ¥��� �ʰ� ���� ¥������ ����Ѵ�. �̷� ������ �ִٴ� ���� �˾Ƶθ� ����.
public class Ex02 {
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();
		list.add(new B());
		list.add(new C());
		list.add(new B());
		list.add(new C());
		
		D d = new D(); 	// D ��ü ����
		d.func01(list);
		
		A a1 = new B();
		// a1.func02(); // ������ �������δ� ����� �� ������ �޸𸮿��� �����Ѵ�.	
		((B)a1).func02(); // �޸𸮿� �����ϱ� ������ ������ ĳ�����ؼ� ��� �� �� �ִ�.
	}
}
