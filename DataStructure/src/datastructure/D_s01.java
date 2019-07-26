package datastructure;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class D_s01 {
	static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	static int exponent(int n, int exp) {
		int sum = 1;
		for (int i = 0; i < exp; ++i) {
			sum *= n;
		}
		return sum;
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
//		// 1번 자바의 기본 자료타입 8가지
//		// byte = 1byte
//		// char = 2byte
//		// short = 2byte
//		// int = 4byte
//		// long = 8byte
//		// float = 4byte
//		// double = 8byte
//		// boolean = 1byte
//
//		// 2-1번 구구단 5단만 출력
//		System.out.println("<ex 2-1>");
//		int num = 5;
//		for (int j = 0; j < 10; ++j) {
//			System.out.println(num + " x " + j + " = " + num * j);
//		}
//
//		// 2-2번 구구단 5단만인데 printf 사용
//		System.out.println("---------------");
//		System.out.println("<ex 2-2>");
//		for (int j = 0; j < 10; ++j) {
//			System.out.printf("%d x %d = %d\n", num, j, num * j);
//		}
//
//		// 3번 1부터 100까지 합산
//		System.out.println("---------------");
//		System.out.println("<ex 3>");
//		int sum = 0;
//		for (int i = 1; i < 101; ++i) {
//			sum += i;
//		}
//		System.out.println("1부터 100까지의 합 : " + sum);
//
//		// 4번
//		// 키보드로부터 숫자를 하나 입력받는 코드
//		System.out.println("---------------");
//		System.out.println("<ex 4>");
//		System.out.print("숫자 입력 : ");
//		int num1 = scanner.nextInt();
//		System.out.println("입력 값 = " + num1);
//
//		// 5-1번 0부터 100사이 숫자를 랜덤하게 출력하세요
//		System.out.println("---------------");
//		System.out.println("<ex 5-1>");
//		int rand = (int) (Math.random() * 100) % 100;
//		System.out.println("0~100 사이의 랜덤 값 : " + rand);
//
//		// 5-2번 50부터 100사이의 숫자를 랜덤하게 10개 출력하세요
//		System.out.println("---------------");
//		System.out.println("<ex 5-2>");
//		int count = 0;
//		System.out.print("50~100 사이의 랜덤 값  10개: ");
//		while (count != 10) {
//			int rand5 = random.nextInt(100);
//			if (rand5 >= 50) {
//				System.out.print(rand5 + " ");
//				count++;
//			}
//		}
//		System.out.println();
//
//		// 5-3번 -10부터 +10까지의 숫자를 랜덤하게 10개 출력하세요. -10, +10 포함
//		System.out.println("---------------");
//		System.out.println("<ex 5-3>");
//		System.out.print("-10~10 사이의 랜덤 값  10개: ");
//		for (int i = 0; i < 10; ++i) {
//			// int rand = (int) ((Math.random() * 20) % 20) - 10;
//			int rand6 = random.nextInt(20) - 10;
//			System.out.print(rand6 + " ");
//		}
//		System.out.println();
//
//		// 5-4번 0.0부터 1.0 숫자를 랜덤하게 5개 출력하세요.
//		System.out.println("---------------");
//		System.out.println("<ex 5-4>");
//		System.out.print("0.0~1.0 사이의 랜덤 값 5개 : ");
//		for (int i = 0; i < 5; ++i) {
//			float f = random.nextFloat();
//			System.out.printf("%.1f ", f);
//		}
//		System.out.println();
//
//		// 5-5번 0부터 100사이의 숫자 중에서 4의 배수만 랜덤하게 10개 출력
//		System.out.println("---------------");
//		System.out.println("<ex 5-5>");
//		System.out.print("0~100 중 4의 배수만 랜덤하게 10개 출력 : ");
//		int count2 = 0;
//		while (count2 != 10) {
//			int rand8 = random.nextInt(100);
//			if (rand8 % 4 == 0 && rand8 != 0) {
//				System.out.print(rand8 + " ");
//				count2++;
//			}
//		}
//		System.out.println();
//
//		// 6번 3의4승 혹은 2의 7승을 구해주는 static 함수를 만드세요.
//		System.out.println("---------------");
//		System.out.println("<ex 6>");
//		System.out.println("예로 3의 4승을 구한다고 치자");
//		System.out.println("3이 num이고 4가 지수다. 입력 기기");
//		System.out.print("num 입력 : ");
//		int num6 = scanner.nextInt();
//		System.out.print("지수 입력 : ");
//		int exp = scanner.nextInt();
//
//		int expo = exponent(num6, exp);
//		System.out.println("3의 4승은 : " + expo);
//
//		// 7번 n! 함수를 만드세요. <단, 재귀 함수를 사용하세요.>
//		System.out.println("---------------");
//		System.out.println("<ex 7>");
//		int sum1 = factorial(10);
//		System.out.println("10! : " + sum1);
//
//		// 8번 피보나치 수 30 자리를 출력하세요.
//		// ex/ 0, 1, 1, 2, 3, 5, 8, 13, 21.....
//		System.out.println("---------------");
//		System.out.println("<ex 8>");
//		int one = 0;
//		int two = 1;
//		int tmp = 0;
//		System.out.print("피보나치 30개 : " + one + " " + two + " ");
//		for (int i = 0; i < 28; ++i) {
//			tmp = one + two;
//			System.out.print(tmp + " ");
//			one = two;
//			two = tmp;
//		}
//		System.out.println();
//
//		// 9번 0부터 100사이의 숫자 한개를 뽑아서 두 자리를 합한 결과를 구하세요.
//		// ex) 38이 나왔다. 38 보여주고 결과는 11이 나와야 한다.
//		// ex) 87이 나왔다. 87 보여주고 결과는 15가 나와야 한다.
//		System.out.println("---------------");
//		System.out.println("<ex 9>");
//		int rand2 = (int) (Math.random() * 100) % 100;
//		System.out.println(rand2);
//		System.out.println("자리 숫자의 합 : " + (rand2 / 10 + rand2 % 10));
//
//		// 10번
//		// 0부터 100사이의 숫자를 10개 출력하고 10자리의 합과 단자리의 합을 출력하라. 단, 배열 사용 노노해
//		System.out.println("---------------");
//		System.out.println("<ex 10>");
//		int one_sum = 0;
//		int two_sum = 0;
//		System.out.print("0~100 사이의 랜덤 값 10개 : ");
//		for (int i = 0; i < 10; ++i) {
//			int rand3 = (int) (Math.random() * 100) % 100;
//			System.out.print(rand3 + " ");
//			one_sum += rand3 / 10;
//			two_sum += rand3 % 10;
//		}
//		System.out.println();
//		System.out.println("10자리의 합 : " + one_sum);
//		System.out.println("단자리의 합 : " + two_sum);
//
//		// 11번 100부터 1000 사이의 숫자를 랜덤하게 10개를 뽑고 단, 반드시 10개를 출력
//		// 그리고 제약조건, 같은 숫자가 중복 되어서는 안된다.
//		// 123이 아니라 122 이런 자리를 봤을 때 22가 중복 되면 안된다. 222 이런 중복이 나오면 안된다.
//		// 반복횟수를 모르기 때문에 while문사용
//		System.out.println("---------------");
//		System.out.println("<ex 11>");
//		int count1 = 0;
//		int one3, two3, three3;
//
//		System.out.print("100~1000 사이의 랜덤 값  10개: ");
//		while (count1 != 10) {
//			int rand4 = (int) (Math.random() * 1000) % 1000;
//			one3 = rand4 / 100;
//			two3 = (rand4 - (one3 * 100)) / 10;
//			three3 = rand4 % 10;
//			if (rand4 >= 100 && one3 != two3 && one3 != three3 && two3 != three3) {
//				System.out.print(rand4 + " ");
//				count1++;
//			}
//		}
//		System.out.println();
//
//		// 12번
//		// integer의 max_value()함수를 이용해 숫자를 랜덤하게 출력하고
//		// ex) 123456가 랜덤하게 나왔다. 출력 결과는 6 5 4 3 2 1
//		System.out.println("---------------");
//		System.out.println("<ex 12>");
//		int number = Integer.MAX_VALUE;
//		System.out.println(number);
//		int[] num11 = new int[10];
//		for (int i = 0; i < 10; ++i) {
//			num11[i] = number % 10;
//			number /= 10;
//			System.out.print(num11[i] + " ");
//		}
//		System.out.println();
//
//		// 13번
//		// int h=2, m=17, s=45 시, 분, 초의 약자
//		// 이렇게 되어 있을 때 초로 환산하세요.
//		System.out.println("---------------");
//		System.out.println("<ex 13>");
//		int h = 2, m = 17, s = 45;
//		System.out.println("초로 환산 : " + ((h * 3600) + (m * 60) + s));
//
//		// 14번
//		// s=123456일 때, 이것을 다시 시, 분, 초 로 나타내세요.
//		System.out.println("---------------");
//		System.out.println("<ex 14>");
//		int ss = 123456;
//		System.out.println("시간 : " + ss / 3600);
//		System.out.println("분 : " + (ss % 3600) / 60);
//		System.out.println("초 : " + (ss % 3600) % 60);
//
//		// 15번
//		// 랜덤하게 o와 x를 10를 출력, 배열 사용 하지마라
//		// oxoooxxoox 이렇게 출력하고 o가 연속해서 가장 많이 나온 횟수와 x가 가장 많이 나온 횟수를 출력한다.
//		System.out.println("---------------");
//		System.out.println("<ex 15>");
//		int count_o = 0, count_x = 0;
//		int max_count_o = 0, max_count_x = 0;
//		for (int i = 0; i < 10; ++i) {
//			int rand7 = random.nextInt(2);
//			if (rand7 == 0) {
//				System.out.print("o");
//				count_o++;
//				if (count_o >= max_count_o) {
//					max_count_o = count_o;
//				}
//				count_x = 0;
//			} else {
//				System.out.print("x");
//				count_x++;
//				if (count_x >= max_count_x) {
//					max_count_x = count_x;
//				}
//				count_o = 0;
//			}
//		}
//		System.out.println();
//		System.out.println("max_count_o : " + max_count_o);
//		System.out.println("max_count_x : " + max_count_x);

		// 16번
		// 2019년도 1월 1일이 화요일인것을 이미 알고 있다고 가정한다.
		// 2019년도 달력을 출력해라.
		// 컴퓨터 화면 처럼 나와야 된다.
		// 월화수목금토일은 문자열 배열 안에 넣어 놓고 사용해도 가능
		int year = 2019, month = 1, week = 0, day = 1, i = 0;
		int monthSet[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 일(0), 월(1), 화(2), 수(3), 목(4), 금(5), 토(6), 일(7)
		for(int j = 0 ; j < 12 ; ++j) {
			System.out.println("");

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // 윤년의 조건.
				monthSet[1] = 29; // 윤년이면 2월 (monthSet[1])은 29일,
			else
				monthSet[1] = 28; // 윤년이 아니면 2월은 28일이다.

			// 01년 1월 1일부터 계산.
			for (i = 0; i < month - 1; i++) {
				day += monthSet[i];
			}
			week = day % 7 +1; // 구하고자 하는 달의 시작일(1일)의 요일을 구함.(0~7<월~금>)
			
			System.out.println("\t\t< "+year+"년 "+ month + "월"+" >");
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", "일", "월", "화", "수", "목", "금", "토");

			for (i = 0; i < week; i++) {
				if(week != 7)
					System.out.print("\t"); // 1일이 시작하기 전 공백을 위한 반복문.
			}
			for (i = 1; i <= monthSet[month - 1]; i++) {
				System.out.printf("%d\t", i); // i를 입력한 달의 일수만큼 찍음.
				week++;
				if (week % 7 == 0) // 요일이 일요일이 지나면
					System.out.println(""); // 줄을 바꿈.

			}
			month++;
		}

	}

}
