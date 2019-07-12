package D_0712;

////4번 실습
////상속의 활용(부->자 <업캐스팅>), 다형성
//class Apple {
//void func01() {
//	System.out.println("<부>함수 1번 call");
//}
//void func03() {
//	System.out.println("<부>함수 3번 call");
//}
//}
//
//class Orenge extends Apple {
//void func02() {
//	System.out.println("<오_자>함수 2번 call");
//}
//void func03() {
//	System.out.println("<오_자>함수 3번 call");
//}
//}
//
//class Banana extends Apple {
//void func03() {
//	System.out.println("<바_자>함수 3번 call");
//}
//}
//
//class Kiwe extends Apple {
//void func03() {
//	System.out.println("<키_자>함수 3번 call");
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
////	// 부->자 <업캐스팅>
////	Apple a1 = new Orenge(); 
////	a1.func01(); // func02()사용 불가, 메모리는 존재하지만 문법 사용 불가
////	a1.func03(); // 문법상 자식을 사용하지는 못하지만 메모리에는 이미 존재하고 있기 때문에 오버라이딩 된 자식 함수가 출력됨.
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
//	//위 스위치문과 똑같은 문장이다.
//	//다형성을 사용하지 않으면 이 문장이 성립 할 수 없다.
//	Apple[] a4 = new Apple[3];	// Apple 객체 3개를 만들 수 있는 배열 변수 선언(아직 객체 생성되지 않음, 배열만 생성)
//	a4[0] = new Orenge(); // 부->자<업캐스팅>
//	a4[1] = new Banana(); // 부->자<업캐스팅>
//	a4[2] = new Kiwe(); // 부->자<업캐스팅>
//	
//	a4[num].func03();
//	
//	Dog d = new Dog();
//	// 인수의 전달은 일종의 대입연산이다.
//	// 부모(Apple)가 받아서 메소드 오버라이딩(다형성)을 이용한다.
//	// 여러개의 함수를 선언하여 사용 할 필요가 없다.
//	d.func01(new Orenge()); // Orenge 객체를 인수로 사용
//	d.func01(new Banana());
//	d.func01(new Kiwe());
//	
//	
//}
//}