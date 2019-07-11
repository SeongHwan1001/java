package D_0711;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		/*System.out.println("Hello World!");
		
		//************************************************************
		int a = 10;
		int b;
		
		if(a > 0)
			b = 3;
		else
			b = 4;
		
		// 이 모양이면 무조건 삼항연산자 
		
		b = (a > 0) ? 3 : 4;
		
		if(a > 0)
			System.out.println("호랑이");
		else
			System.out.println("코끼리");
		
		// 이 문장도 삼항연산자가 됨
		
		System.out.println((a > 0) ? "호랑이" : "코끼리");*/
		
		//************************************************************
		
		
		// 어떤 걸 풀지 모르지만 중간값이 나오도록(3항 연산자의 예제)
		//int a = 1, b = 2, c = 3;
		//int a = 1, b = 3, c = 2;
		//int a = 2, b = 1, c = 3;
		//int a = 2, b = 3, c = 1;
		//int a = 3, b = 1, c = 2;
		//int a = 3, b = 2, c = 1;
	
		// 내가 짠 소스
//		int temp = (a+b) > (a+c) ? a+b : a+c;
//		System.out.println(temp > (b+c) ? temp/2 : (b+c)/2);	
		
		
		//강사님 1차
//		int m;
//		
//		if(a > b) {	//a는 최대 아니면 중간
//			if(a > c) { //a는 최대
//				if(b > c) //b는 중간
//					m = b;
//			}
//			else //a는 중간
//				m = a;
//		}
//		else {//c는 중간
//			if(a < c) {
//				if(b > c) {
//					m = c;
//				}
//				else
//					m = b;
//			} 
//		}
//			m = c;
		
		// 강사님 2차 수정
//		int m;
//		
//		if(a > b) {	//a는 최대 아니면 중간
//			if(a > c) { //a는 최대
//				m = Math.max(b, c);
//			}
//			else //a는 중간
//				m = a;
//		}
//		else {//c는 중간
//			if(a < c) {
//				m = Math.min(b, c);
//			} 
//			else
//				m = a;
//		}
		
		// 강사님 3차 수정
//		int m;
//		
//		if(a > b) {	//a는 최대 아니면 중간
//			m = (a > c) ? Math.max(b, c) : a;
//		}
//		else {//c는 중간
//			m = (a < c) ? Math.min(b, c) : a;
//		}
		
		// 강사님 최종
		//int m = (a > b) ? (a > c) ? Math.max(b, c) : a : (a < c) ? Math.min(b, c) : a;
		//System.out.println(m);
		
		//************************************************************
		
		// 항상 검증 할 것!!!!!!!!!
		// 0부터 100 사이의 숫자 10개 출력하여 위 예제 검증
		/*Random rand = new Random();
		int num;
		//int m;
		
		for(int i = 0 ; i < 10 ; i++) {
			//num = rand.nextInt(100);
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			int c = rand.nextInt(100);
			
			int m = (a > b) ? (a > c) ? Math.max(b, c) : a : (a < c) ? Math.min(b, c) : a;
			
			System.out.println(a+","+b+","+c+"="+m);
		}*/
		//************************************************************
		
		// 제어문을 사용하지 않고 프로그램 짜는 방법
//		Random rand = new Random();
//		//int arr[] = new int[10];
//		String arr[] = {"호랑이", "코끼리", "독수리"};
//		
//		for(int i = 0; i < 10 ; i++) {
//			int num = rand.nextInt(3);
//			
//			//System.out.println(num);
//			
//			/*switch (num) {
//			case 0:
//				System.out.println("호랑이");
//				break;
//			case 1:
//				System.out.println("코끼리");
//				break;
//			case 2:
//				System.out.println("독수리");
//				break;
//			default:
//				break;
//			}*/
//			
//			System.out.println(arr[num]);
//			
//		}
		//************************************************************
		
		//우박수 출력 횟수 구하기
//		Random rand = new Random();
//		int num = rand.nextInt(100);
//		int count = 0;
//		
//		System.out.println(num);
//		
//		while(num != 1) {
//			num = (num % 2 == 0) ? num / 2 : num*3 + 1;  
//			count++;
//		}
//		System.out.println(count);
		
		//************************************************************
		
//		// 아주 전형적인 문장
//		// 무조건 i는 0부터, 조건문은 뭐보다 작다라고 표시하는 것이 좋다. 90% 사용되는 모양꼴
//		for(int i = 0 ; i < 10 ; ++i) {
//			
//		}
//		
//		// 위와 횟수 동일, 10% 사용되는 모양꼴
//		for(int i = 1 ; i <= 10 ; i++) {
//			
//		}
//		
//		// 횟수 11회, 최적화 때문에 사용
//		for(int i = -5 ; i <= 5 ; i++) {
//			
//		}
//		
//		
//		// 위 3가지 형태의 for문만을 사용해라.!!
		
		//************************************************************
	}
}
