package D_0712;

//2�� �ǽ�
//�������� Ŭ���� ������ ���������� public�� �ϳ��� ���� �� �ִ�.
//class Apple {
//	
//	//�ʵ�, �ʱ�ȭ�� �����ڸ� ���� �ʱ�ȭ �� �� �ֵ��� ������Ű��
//	int num; 
//	
//	// ������ �̸��� Ŭ���� �̸��� �����ؾ� ��.
//	// ��ü�� ���� �� �� �� �ѹ� ȣ��
//	Apple() {
//		System.out.println("������ call");
//		System.out.println(this.hashCode()); // �Ʒ��� hashcode�� ����, this = a, �¾�� �� �������ִ� ��
//		
//		num = 0;
//	}
//	
//	Apple(int a, int b) {
//		
//	}
//	
//	Apple(int num) { // ������ �Ű������� �ʵ庯���� �ʱ�ȭ �ϱ� ���� ��� ��
//		this.num = num; // this�� ���� ���� �����̴�. this�� ü�̴ױ��, ������ �̿ܿ� ��� �� ���� ���� ����.
//	}
//	
//	void func01() {  // ������ �Լ����� func�� ����
//		System.out.println("�Լ� 1�� call");
//	}
//	
//	void func02(int a, int b) {
//		System.out.println(a + b);
//	}
//	
//	int func03() {
//		return 100;
//	}
//	
//	int func04(int a, int b) {
//		return a+b;
//	}
//	
//	Apple func05() {
//		System.out.println("�Լ� 5�� call");
//		return this;
//	}
//	
//	void func06() {
//		System.out.println("�Լ� 6�� call");
//	}
//	// �Լ� �����ε�
//	int func06(int a) {
//		return a;
//	}
//	// �Լ� �����ε�
//	char func06(char c) {
//		return c;	// return Ÿ������ �����ε� �Ұ���, �˼��� ����.
//	}
//	
//}
//
//public class Test02_01 {
//	public static void main(String[] args) {
//		Apple a = new Apple();
//		System.out.println(a.hashCode()); // hashcode()�� ��ü�� �ֹε�� ��ȣ����
//		a.func01();
//		System.out.println(a.num);
//		a.func02(3, 4);
//		System.out.println(a.func03());
//		System.out.println(a.func04(4, 5));
//		a.func05(); // �ڱ��ڽ� return
//		a.func05().func05().func06(); // ü�̴� ���, ���ֺ��� �Ǵ� ���� ����
//		
//		// ���� ü�̴� �Ǵ� �Լ��� �Ʒ��� ��Ĵ�� ����� �Ѵ�.
//		a
//		.func05()
//		.func05()
//		.func06();
//		
//	}
//}