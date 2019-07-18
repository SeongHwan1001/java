package D_0718;

//2019.07.18(��) ���� �ǽ�
// ���ٽ� ���¿� �ͼ�������

// Ex01
// �������̽��� �͸� �Լ��� ����
//interface Apple {
//	void func01();
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		// �͸� �Լ� ����
//		Apple a = new Apple() {
//			@Override
//			public void func01() {
//				System.out.println("Apple call");
//			}
//		};
//		a.func01();
//	}
//}




// Ex02
// �������̽��� ���ٽ����� ����
//interface Apple {
//	void func01();
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		// ���ٽ� ���� , new Apple()�� �����ߴٰ� ����
//		Apple a = () -> {	// �� �Լ��� func01 ���� �� ��
//				System.out.println("Apple call");
//		};
//		a.func01();
//	}
//}


// Ex03
// �μ������� �ִ� �������̽�
//interface Apple {
//	void func01(int num);
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = (num) -> {	
//				System.out.println("Apple a num : " + num);
//		};
//		a.func01(10);
//		
//		// �μ������� �Ѱ� �϶��� () ��������, ���� �ڵ忡���� ������ ���� ����Ѵ�.
//		Apple b = num -> {	
//			System.out.println("Apple b num : " + num);
//		};
//		b.func01(20);
//		
//		// ����Ǵ� ������ �� ������ �� �������� ���� �� �� �ִ�.
//		Apple c = num -> System.out.println("Apple c num : " + num);
//		
//		c.func01(30);
//		
//		// ���ٽ� �ڵ�� ���� �ʰ� ������ ������ �׳� ��� �� �ڵ�� �ν��Ѵ�.
//		Apple cc = num -> 
//			System.out.println("Apple c num : " + num);
//			System.out.println("dmdmdmdmdm");
//		
//		//cc.func01(30); // �ּ� ó���ϰ� ���� �� ���� �ǹ� ����
//	}
//}

//Ex04
//�μ������� 2�� �ִ� �������̽�
//interface Apple {
//	void func01(int n, String s);
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = (num, s) -> {	
//				System.out.println("�μ�1 : " + num + ", �μ�2 : " + s);
//		};
//		a.func01(10, "222");
//	}
//}

// Ex05
// ���ϰ��� �ִ� �������̽�
//interface Apple {
//	int func01();
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = () -> {	
//				return 100; 
//		};
//		System.out.println("Apple a : " + a.func01());
//		
//		// �ܹ����� �� �������� ���� �� �� ������ �����ϰ��� �� �� return �� ������ �ؾ� �Ѵ�.
//		// �������� �Ʒ��� ����� ���� ����Ѵ�.
//		// �Ʒ��� ���� ���� ���� ���Ǵ� ����
//		Apple b = () -> 100; // ���� ���� ��� *****
//		System.out.println("Apple b : " + b.func01());
//		
//		// �Լ��ȿ� �Լ��� �ִ�.(IIFE �����̶�� �Ѵ�.) �Ŀ� �ѹ� ã�ƺ���
//		/* Apple c = () -> {return (100) -> {
//			return 200;
//		}};*/
//	}
//}

//Ex06
//�μ�����, ���� ��� �ִ� �������̽�
//interface Apple {
//	int func01(int n);
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = (n) -> {
//			return 200*n; 
//		};
//		
//		Apple b = n -> 300*n;
//		
//		System.out.println(a.func01(3));
//		System.out.println(a.func01(4));
//	}
//}

//Ex07
interface Apple {
	void func01(int n, String s);
}

class Banana {
	void func02(Apple apple) {
		apple.func01(100, "app");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Banana b = new Banana();
		
		b.func02(new Apple() {
			@Override
			public void func01(int n, String s) {
				System.out.println("n : " + n + ", s : " + s);
			}
		});
		
		b.func02((n, s) -> {
			System.out.println("n : " + n + ", s : " + s);
		});
	}
}






