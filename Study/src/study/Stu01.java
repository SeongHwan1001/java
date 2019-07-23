package study;

// 람다식 간단예제 1

interface Say {
	int someting(int a, int b);
}

class Person {
	public void hi(Say line) {
		int number = line.someting(3, 4);
		System.out.println("Number is " + number);
	}
}

public class Stu01 {
	public static void main(String[] args) {
		Person rin = new Person();
		rin.hi( (a, b) -> {
			System.out.println("My Name is Coding");
			
			return 7;
		});
	}
	
}
