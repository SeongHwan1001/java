package D_0717;

public class Ex01 {
	public static void main(String[] args) {
		// 다형성을 제외하고 대입 연산자는 반드시 타입이 같아야 한다.
		// b=a+1 : 오칙연산이 일어나는 경우에는 모두 int로 처리한다. 그래서 a+1은 int타입이 된다. 그렇게 때문에 에러
		short a = 3, b = (short)(a+1);	// 타입캐스팅 : 받는 놈에 맞춘다.

		// 4byte 이하 연산은 전부 int로 보는데
		// long 일 경우에는 가장 큰 타입을 쓰고 있는데 long타입으로 변환된다.(4byte 이상 연산은 큰 타입으로 변환)
		// 이 또한 타입캐스팅 실시
		long a2 = 10;
		int b2;
		b2 = (int)(a2+1);
		
		//------------------------------------------------------------------------------
		////진법<8, 10, 16진법>
		
		// int가 가지고 있는 max값
		System.out.println(Integer.MAX_VALUE);
		// 10진수 -> 16진수
		System.out.println(Integer.toHexString(1234));
		// 최상위 비트가 0이기 때문에 맨 앞은 7이 나옴.
		System.out.println(Integer.toHexString(Integer.MAX_VALUE)); // 7fffffff
		
		//0x3c94ab73(0011 1100 1001 0100 1010 1011 0111 0011)
		int b3 = 00037;
		int a3 = 0376;	// 앞에 0은 8진수(0~7) : 0386은 에러		
	}
}
