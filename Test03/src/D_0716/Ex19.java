package D_0716;

interface Apple19 {
	void func01();
}

// �ᱹ Banana�� �� ����ϱ� ������ �Լ��� ���� ���� �ʾƵ� ��
// �������̽� �ȿ� �������̽��� ����ϴ� �Ͱ� ����.
abstract class Banana19 implements Apple19 {
	public void func01() {
	}
	abstract void func02();
}

public class Ex19 {
	public static void main(String[] args) {
		Banana19 b = new Banana19() {
			@Override
			public void func01() {
				System.out.println("Banana19 func01 call");
			}
			@Override
			public void func02() {
				System.out.println("Banana19 func02 call");
			}
		};
		
		b.func01();
		b.func02();
	}
}
