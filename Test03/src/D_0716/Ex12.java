package D_0716;

// Ŭ���� ���ο� Ŭ����
class Apple12 {
	void func01() {
		System.out.println("Apple call");
	}
	class Banana12 {
		void func02() {
			System.out.println("Banana call");
		}
	}
}

public class Ex12 {
	public static void main(String[] args) {
		// Apple Ŭ������ ��� ����ϴ� ���ó�� ��� �ϸ� ��
		Apple12 a = new Apple12();
		a.func01();
		
		// Apple12�� �����ִ� Banana class�� �Լ��� ȣ���ϴ� ���
		Apple12.Banana12 b = a.new Banana12();
		b.func02();
	}
}
