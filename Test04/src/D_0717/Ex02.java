package D_0717;

class Apple02{
	// static은 프로그램 시작 시점부터 메모리에 만들어짐.
	// 객체 생성 없이 사용 할 수 있다.
	static void func01() {	
		System.out.println(1);
		// 시작 시점부터 메모리에 할당 하려고 하는데 func02가 아직 메모리에 할당 되지 않아서 에러
		// 그래서 static은 static을 사용해야 한다.
		func02(); //에러
	}
	static void func02() {
		System.out.println(2);
	}
}

public class Ex02 {
	// main에서 사용 불가
	void func01() {	
	}
	
	// main에서 사용 가능 , static이기 때문
	// main에서 함수를 만들어서 간단하게 test 하기 위해 사용
	static void func02() {
	}
	
	// main에서 사용 가능
	// num 값을 2진수 출력 될 수 있도록 하기.
	// 내가 작성한 코드
	static void func03(int num) {	// 내가 작성
		
		String arr[];	// 배열 선언
		System.out.println(num);
		
		String bi = Integer.toBinaryString(num);	// 10진수 num을 2진수로 변환
		
		// 제일 앞 2진수에 0이 붙지 않는 현상으로 인해 나머지를 구해 붙여주기 위함.
		int num1 = bi.length() % 4;
		
		// 4에서 나머지 값을 뺀 값이 부족한 0의 갯수가 됨
		for(int j = 0 ; j < 4-num1 ; j++) {
			bi = 0+bi;
		}
		System.out.println(bi);
		
		// 앞의 0을 붙여준 후 4비트씩 자리를 맞춰 준 후에 각 숫자를 배열에 삽입
		arr = bi.split("");
			
		// 삽입 한 배열을 4비트씩 구분하기 위해서 if조건 사용하여 출력
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]);
			if(i%4==3)
				System.out.print(" ");
		}

	}
	
	// 강사님과 작성
	static void func04(int num) {
		/*String ss = Integer.toBinaryString(num);
		System.out.println(ss);*/
		
		// s1이 이진수를 가지고 있다.
		String s1 = Integer.toBinaryString(num);
		System.out.println(s1.length()); // 문자열의 길이
		
		// 부족한 0의 개수를 추가하기 위해
		char[] ar = new char[32-s1.length()];
		
		for(int i = 0 ; i < ar.length ; i++) {
			ar[i] = '0';
		}
		
		String s2 = new String(ar);
		System.out.println(s2);
		
		String s3 = s2+s1;
		System.out.println(s3.length());
		
		// s3와 출력 값은 동일함.
		StringBuffer s4 = new StringBuffer(s2+s1);
		System.out.println(s4.length());
		
		//s4.insert(4, ' ');
		
		for(int i = 0 ; i < 7 ; i++) {
			s4.insert((7-i)*4, ' ');
		}
		System.out.println(s4);
		System.out.println(s4.length());
	}
	public static void main(String[] args) {
		// 객체 생성 없이 바로 생성 가능
		//Apple02.func01();
		
		//0x3c94ab73(0011 1100 1001 0100 1010 1011 0111 0011)
		// func03(0x3c94ab73);
		
		// 강사님과
		func04(0x3c94ab73);
	}
}
