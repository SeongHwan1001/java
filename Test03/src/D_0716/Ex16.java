package D_0716;

// Ex15 ¿¬½À

interface Apple16 {
	void func01();
}

class Banana16 {
	public void func02(Apple16 apple16) {
		System.out.println("Banana16 call");
		apple16.func01();
	}
}

public class Ex16 {
	public static void main(String[] args) {
		Banana16 b = new Banana16();
		
		b.func02(new Apple16() {
			@Override
			public void func01() {
				System.out.println("Apple16 call");
			}
		});
	}
}
