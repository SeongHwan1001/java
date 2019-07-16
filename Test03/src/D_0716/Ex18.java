package D_0716;

interface Apple18 {
	void func01();
}

class Banana18 implements Apple18 {
	public void func01() {
		System.out.println("1 Banana18 call");
	}
}

public class Ex18 {
	public static void main(String[] args) {
		// 1
		Banana18 b = new Banana18();
		b.func01();
		
		// 2
		Apple18 a = new Apple18() {
			@Override
			public void func01() {
				System.out.println("2 Banana18 call");
				
			}
		};
		a.func01();
		
		// 3
		Banana18 b1 = new Banana18() {
			@Override
			public void func01() {
				System.out.println("3 Banana18 call");
			}
		};
		b1.func01();
	}
}
