package D_0712;

//5�� �ǽ�
//���������� �Ÿ��� ������ ������� �κ� �ǽ�
//���������� ������ ����ų ������ �ִ� �ҽ��̴�.
//class Apple {
//	
//	//�ʵ�
////	Banana ba;
////	Orenge or;
//	Fruit fr;
//	
//	//������ ����(injection)
//	Apple(Fruit fr) {
//		this.fr = fr;
//	}
//	
//	//�޼���
//	void func01() {
//		fr.func03();
////		ba.func03();
////		or.func03();
//	}
//	void func02() {
//		fr.func03();
////		ba.func03();
////		or.func03();
//	}
//}
//
//class Fruit {
//	void func03() {
//		System.out.println("Fruit �Լ� 3�� call");
//	}
//}
//
//class Banana extends Fruit {
//	void func03() {
//		System.out.println("Banana �Լ� 3�� call");
//	}
//}
//
//class Orenge extends Fruit {
//	void func03() {
//		System.out.println("Orenge �Լ� 3�� call");
//	}
//}
//
//public class Test02_04 {
//	public static void main(String[] args) {
//		//Apple a = new Apple();
//		// �� �Լ��� ȣ�� �Ҷ����� ���ο� ��ü�� �����Ͽ� �ѱ�� ����
//		// �Լ��� �μ� ������ ��������� ����� ���� ����� �������� 2��°�� ���� �߻���.
//		//a.func01(new Banana());
//		//a.func02(new Banana());
//		
//		// �����ڸ� ��������ν� ������� ����� ���̰� ���� ��ü�� �����.
//		// �������� ��������ν� �ݺ��Ǵ� �Լ��� ���� �ϵ��� ��
//		Apple a1 = new Apple(new Banana());
//		a1.func01();
//		a1.func02();
//		Apple a2 = new Apple(new Orenge());
//		a2.func01();
//		a2.func02();
//	}
//}