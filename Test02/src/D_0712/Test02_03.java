package D_0712;

////4�� �ǽ�
////����� Ȱ��(��->�� <��ĳ����>), ������
//class Apple {
//void func01() {
//	System.out.println("<��>�Լ� 1�� call");
//}
//void func03() {
//	System.out.println("<��>�Լ� 3�� call");
//}
//}
//
//class Orenge extends Apple {
//void func02() {
//	System.out.println("<��_��>�Լ� 2�� call");
//}
//void func03() {
//	System.out.println("<��_��>�Լ� 3�� call");
//}
//}
//
//class Banana extends Apple {
//void func03() {
//	System.out.println("<��_��>�Լ� 3�� call");
//}
//}
//
//class Kiwe extends Apple {
//void func03() {
//	System.out.println("<Ű_��>�Լ� 3�� call");
//}
//}
//
//class Dog {
//void func01(Apple a) {
//	a.func03();
//}
////void func02(Banana b) {
////	b.func03();
////}
////void func03(Kiwe k) {
////	k.func03();
////}
//}
//
//public class Test02_03 {
//public static void main(String[] args) {
////	// ��->�� <��ĳ����>
////	Apple a1 = new Orenge(); 
////	a1.func01(); // func02()��� �Ұ�, �޸𸮴� ���������� ���� ��� �Ұ�
////	a1.func03(); // ������ �ڽ��� ��������� �������� �޸𸮿��� �̹� �����ϰ� �ֱ� ������ �������̵� �� �ڽ� �Լ��� ��µ�.
//	
//	Apple a1 = new Orenge();
//	Apple a2 = new Banana();
//	Apple a3 = new Kiwe();
//	
//	Random rand = new Random();
//	int num = rand.nextInt(3);
//	
//	System.out.println("number : "+num);
//	
//	switch (num) {
//	case 0:
//		a1.func03();
//		break;
//	case 1:
//		a2.func03();
//		break;
//	case 2:
//		a3.func03();
//		break;
//	default:
//		break;
//	}
//	
//	//�� ����ġ���� �Ȱ��� �����̴�.
//	//�������� ������� ������ �� ������ ���� �� �� ����.
//	Apple[] a4 = new Apple[3];	// Apple ��ü 3���� ���� �� �ִ� �迭 ���� ����(���� ��ü �������� ����, �迭�� ����)
//	a4[0] = new Orenge(); // ��->��<��ĳ����>
//	a4[1] = new Banana(); // ��->��<��ĳ����>
//	a4[2] = new Kiwe(); // ��->��<��ĳ����>
//	
//	a4[num].func03();
//	
//	Dog d = new Dog();
//	// �μ��� ������ ������ ���Կ����̴�.
//	// �θ�(Apple)�� �޾Ƽ� �޼ҵ� �������̵�(������)�� �̿��Ѵ�.
//	// �������� �Լ��� �����Ͽ� ��� �� �ʿ䰡 ����.
//	d.func01(new Orenge()); // Orenge ��ü�� �μ��� ���
//	d.func01(new Banana());
//	d.func01(new Kiwe());
//	
//	
//}
//}