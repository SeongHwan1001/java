package D_0712;

////////////////////////////
//7�� �ǽ�
//�߻�ȭ �Լ��� �ϳ��� �����Ѵٸ� class ���� abstract �ٿ� ��� ��
//abstract class Animal { 
//	abstract void func01(); // �߻�, �ݵ�� �ڽĿ��� ������־�� ��
//	void func02() {
//		System.out.println("�θ� �Լ� 2�� call");
//	}
//}
//
//class Dog extends Animal {
//	void func01() {
//		System.out.println("�ڽ� �Լ� 1�� call");
//	}
//	void func03() {
//		System.out.println("�ڽ� �Լ� 3�� call");
//	}
//}
//public class Test02_06 {
//	public static void main(String[] args) {
//		Dog d = new Dog();
//
//	}
//}
//////////////////////////////////////////////
//interface Animal { 
//	abstract void func01(); // �߻�ȭ, �ݵ�� �ڽĿ��� ������־�� ��
//	abstract void func02();
//}
//
//class Dog implements Animal { // implements�� ����ϸ� �Լ��� �ݵ�� public�̾�� ��
//	public void func01() {
//		System.out.println("�ڽ� �Լ� 1�� call");
//	}
//	public void func02() {
//		System.out.println("�ڽ� �Լ� 2�� call");
//	}
//}
//public class Test02_06 {
//	public static void main(String[] args) {
//	Dog d = new Dog();
//
//	}
//}