package D_0716;

// ������ ����ϴ� ���� ******
// �����ϰ� �Ѿ��!

class A1 {
	interface B1 {
		void func01();
	}
}

class C1 {
	void func02(A.B ab) {
		//A1.B1
		System.out.println("1 C1 func02 call");
		ab.func01();
	}
}

public class Ex21 {
	public static void main(String[] args) {
		C1 c = new C1();
		
		// �͸� �Լ��� func02 �Լ� �μ��� �ڵ带 ��������
		c.func02(new A.B() {
			@Override
			public void func01() {
				System.out.println("2 C1 func02 call");
			}
		});
	}
}
