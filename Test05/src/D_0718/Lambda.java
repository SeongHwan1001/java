package D_0718;

// ���� �ڵ� ����
interface A {
	void func01();
}

interface B {
	A func02();	// �������̽� return
}

public class Lambda {
	public static void main(String[] args) {
		B b1 = new B() {
			@Override
			public A func02() {
				return new A() {
					@Override
					public void func01() {
						System.out.println("���� ����");
					}
				};
			}
		};
		A a1 = b1.func02();
		a1.func01();
		
		// new class �̸��� ��������, �Լ� �̸� �����⸦ ���ܶ� -> ���ٽ� ����� ���!!!
		// �� �ҽ��� ���ٽ����� ����
		// ���ٽ��� ����ϸ� ���� �ڵ尡 �ȴ�.
		B b2 = () -> () -> System.out.println();
		A a2 = b2.func02();
		a2.func01();
	}
}
