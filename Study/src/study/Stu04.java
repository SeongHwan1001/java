package study;

interface T{
void func01() throws Exception;
}

class Aa {
	void func02(T t) {
		System.out.println(1);
			try {
				t.func01();
			} catch (Exception e) {
			}
		System.out.println(2);
}

void func01() {
	func02(new T() {
		public void func01() throws Exception {
			Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
			System.out.println("ȣ����");
		}
	});
	func02(new T() {
		public void func01() throws Exception {
			Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
			System.out.println("�ڳ���");
		}
	});
	func02(new T() {
		public void func01() throws Exception {
			Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
			System.out.println("������");

		}
	});
	
	
	
	/*System.out.println(1);
	
	try {
		Thread.sleep(2000);
		System.out.println("�ڳ���");
	} catch (Exception e) {

	}
	System.out.println(2);
	
	System.out.println(1);
	
	try {
		Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
		System.out.println("������");
	} catch (Exception e) {

	}
	System.out.println(2);*/
}
}

public class Stu04 {
public static void main(String[] args) {
	Aa a = new Aa();
	a.func01();
}

}