package D_0716;

//������ ����ϴ� ���� ******
//�����ϰ� �Ѿ��!

class A3 {
	interface B3 {
		void func01();
	}
	interface C3 {
		void func02();
	}
}

public class Ex23 {
	public static void main(String[] args) {
		new A3.B3() {
			@Override
			public void func01() {
				System.out.println("B3 ����");
			}
		}.func01();;
		
		
		new A3.C3() {
			@Override
			public void func02() {
				System.out.println("C3 ����");
			}
		}.func02();;
	}
}
