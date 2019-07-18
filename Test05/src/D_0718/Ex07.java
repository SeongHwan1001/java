package D_0718;

//EX01
//AOP(spring�� 3�� ���)
//public class Ex07 {
//	public static void main(String[] args) {
//		System.out.println(1);
//		
//		try {
//			Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
//			System.out.println("ȣ����");
//		} catch (Exception e) {
//
//		}
//		System.out.println(2);
//		
//		System.out.println(1);
//		
//		try {
//			Thread.sleep(2000);
//			System.out.println("�ڳ���");
//		} catch (Exception e) {
//
//		}
//		System.out.println(2);
//		
//		System.out.println(1);
//		
//		try {
//			Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
//			System.out.println("������");
//		} catch (Exception e) {
//
//		}
//		System.out.println(2);
//	}
//}

// EX02
// throws : �Լ��� �θ� ���� å�� ����...
//interface T{
//	void func01() throws Exception;
//}
//
//class Aa {
//	void func02(T t) {
//		System.out.println(1);
//		try {
//			t.func01();
//		} catch (Exception e) {
//		}
//		System.out.println(2);
//	}
//	
//	void func01() {
//		func02(new T() {
//			public void func01() throws Exception {
//				Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
//				System.out.println("ȣ����");
//			}
//		});
//		func02(new T() {
//			public void func01() throws Exception {
//				Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
//				System.out.println("�ڳ���");
//			}
//		});
//		func02(new T() {
//			public void func01() throws Exception {
//				Thread.sleep(2000); // ��� block �ڵ�, �� ������ try-catch�� ����ؾ� ��
//				System.out.println("������");
//	
//			}
//		});
//		
//		
//		
//	}
//}
//
//public class Ex07 {
//	public static void main(String[] args) {
//		Aa a = new Aa();
//		a.func01();
//	}
//
//}



// EX03
// throws : �Լ��� �θ� ���� å�� ����...
// �� �ٽ��غ���!
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
		func02(() -> {
				Thread.sleep(2000);
				System.out.println("ȣ����");
		});
		func02( () -> {
				Thread.sleep(2000);
				System.out.println("�ڳ���");
		});
		func02( () -> {
				Thread.sleep(2000);
				System.out.println("������");
		});
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Aa a = new Aa();
		a.func01();
	}
}