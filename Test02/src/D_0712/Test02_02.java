//package D_0712;
//
////3�� �ǽ�
////������
//class Apple {
//	// �ڵ尡 ������� �����ڸ� ����� ���� ���� �Ϲ����̴�.
//	Apple() {	}
//	
//	Apple(int n) {
//		
//	}
//	
//	void func01() {
//		System.out.println("<��>�Լ� 1�� call");
//	}
//	void func03() {
//		System.out.println("<��>�Լ� 3�� call");
//	}
//	void func05() {
//		func06();
//		func07();
//	}
//	void func06() { 
//		System.out.println("<��>�Լ� 6�� call");
//	}
//	void func07() { 
//		System.out.println("<��>�Լ� 7�� call");
//	}
//}
//
////���
//class Orenge extends Apple {	
//	void func02() {
//		System.out.println("<��>�Լ� 2�� call");
//	}
//	void func03() { // �ڽ��Լ��� ���� �θ��Լ��� ���������ϰ� ǥ���Ѵ�. = �޼ҵ� �������̵�
//		System.out.println("<��>�Լ� 3�� call");
//	}
//	void func04() { // 4�� �Լ��� ���ؼ� 3�� �Լ��� ȣ����. �ٷ� �θ� �Լ��� ȣ�� �� �� ����.
//		func03();  // �ڽ� 3�� �Լ� ȣ��
//		super.func03(); // �θ� 3�� �Լ� ȣ��
//	}
//	// �������̵�
//	// �������̵� �Լ��� ���� �ڽ��� ������. �ڽĿ��� ���� ��쿡 �θ� ������ ����Ѵ�.
//	// �Ѹ���� �޼ҵ� ������(�������̵�)�� �Լ� �θ�� ���õȴ�.
//	void func06() {  
//		System.out.println("<��>�Լ� 6�� call");
//	}
//}
//
//public class Test02_02 {
//	public static void main(String[] args) {
//		// �����ڰ� �ϳ��� �����ϸ� ����Ʈ �����ڸ� ������ ���� �ʴ´�.
//		// �μ����� �� ���� �߻�
//		// �׷��� ������ ����Ʈ �����ڸ� ���� �����ض�.
//		Apple a1 = new Apple();
//		Apple a2 = new Apple(10);
//		
//		Orenge a3 = new Orenge();
//		a3.func01();	// �켱 �ڽĿ��� ���� ���� ������ �θ� ���� ������.
//		a3.func02();	
//		a3.func03();	// �ڽĿ��� �ִ� 03�� �Լ��� �θ���� ȣ�� �� ��� ����
//		a3.func05();
//	}
//}