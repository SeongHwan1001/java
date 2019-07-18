package D_0718;

interface A2 {
	void x2(int a2);
}

/*class B2 {
	public void y2(A2 a2, int num) {
		a2.x2(num);
	}
}*/

public class Ex03 {
	public static void main(String[] args) {
		/*B2 b2 = new B2();
		int i = 10;
		
		// b.y2(a, i);
		
		b2.y2(new A2() {
			public void x2(int a) {
				System.out.println("2 - " + a);
			}
		}, i);
		
		
		b2.y2( (num) -> { System.out.println("2 - " + num); }, i);*/
		
		int i = 10;
		
		A2 a = (a2) -> {
			System.out.println(a2);
		};
		a.x2(i);
	}
}
