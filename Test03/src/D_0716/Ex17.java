package D_0716;
// class�� interface ���̿� �Լ��� �������� �ʴ´�.
class Apple17 {
	interface Banana17 {
		void func01();
	}
}

// 1����� : �� ������� �ʴ� ���
// Orenge17�� �������̽� Banana17�� �Լ� ����
/*class Orenge17 implements Apple17.Banana17 {
	@Override
	public void func01() {
		System.out.println("Banana func01()");
	}
}*/

public class Ex17 {
	public static void main(String[] args) {
		// 1�� ���
		/*Orenge17 o = new Orenge17();
		o.func01();*/
		
		// 2�� ��� : �͸� Ŭ����
		Apple17.Banana17 ab = new Apple17.Banana17() {
			
			@Override
			public void func01() {
				System.out.println("2�� interface Banana func01()");
			}
		};	
		ab.func01();
	
		// 3�� ��� : �͸� ��ü
		new Apple17.Banana17() {
			@Override
			public void func01() {
				System.out.println("3�� interface Banana func01()");
			}
		}.func01();
	}
}
