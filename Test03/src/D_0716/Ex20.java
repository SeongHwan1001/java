package D_0716;

import D_0716.A.B;

class A {
	interface B {
		void func01();
	}
	interface C {
		void func02();
	}
}

public class Ex20 {
	public static void main(String[] args) {
		// Ex17�� 2�� ���
		A.B a = new A.B() {
			@Override
			public void func01() {
				System.out.println("A->B");
			}
		};
		a.func01();
		
		// Ex17�� 3�� ���
		new A.C() {
			@Override
			public void func02() {
				System.out.println("A->C");
				
			}
		}.func02();;
	}
}
