package D_0716;

// Ex14�� ����
// ������ ��� ����� �ڵ�, �ͼ������� ��
// �Լ� �μ��� �ڵ带 �����ߴٶ�� �����ؾ� ��

interface Apple15 {
	void func01();
}

class Banana15 {
	void func02(Apple15 apple15) {
		System.out.println("<1> Banana func02 call");
		apple15.func01();
	}
}

public class Ex15 {
	public static void main(String[] args) {
		Banana15 b = new Banana15();
		
		// �͸� �Լ�
		// �Լ� �μ��� �ڵ� ����
		b.func02(new Apple15() {
			@Override
			public void func01() {
				System.out.println("<2> Apple func01 call");
			}
		});
		
		// �Լ� �μ��� �ڵ� ����
		b.func02(new Apple15() {
			public void func01() {
				System.out.println("<3> Apple func01 call");
			}
		});
		
	}
}
