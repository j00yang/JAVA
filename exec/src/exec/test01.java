package exec;

import java.util.Scanner;

/* 프로그램명 : 
 * 기능 : 
 * 작성일 : 
 * 작성자 : 
 * 수정일 : 2023.08.
 * */
public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.printf("Hello! %n");
		System.out.print("Hello!   ");
		System.out.println("Hello!");*/
		
		/* 연산을 위한 단계
		 * 1. 숫자 입력받기: scanner
		 * 2. 연산하기: 변수
		 * 3. 결과출력하기: print
		 */
		
		//1단계
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int a = 0; int b = 0; int c = a + b;
		 * 
		 * System.out.print("Insert number: "); a = scan.nextInt();
		 * 
		 * System.out.print("Insert number: "); b = scan.nextInt();
		 * 
		 * System.out.printf("합한 값은 %d입니다.",c);
		 */
		
		
		//2,3단계
			//정수를 2개 입력 받아 결과값 출력하기
				//1단계: 2, 5 입력
				//2단계: 2, 5를 변수에 저장
		int a = 2;
		int b = 5;
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		
		float h = 500/3;
		
		System.out.printf("%d와 %d의 합은 %d, 뺀 값은 %d, 곱은 %d입니다.%n",a,b,c,d,e,f);
		System.out.printf("%d를 %d로 나눈 값은 %d이고, 나머지는 %d입니다.%n",a,b,f,g);
		System.out.printf(a+"와 "+b+"의 합은 " +c+", 뺀 값은 "+d+", 곱은 "+e+", 나눈 값은 "+f+"입니다.%n",a,b,c,d,e,f);
		
		System.out.printf("500과 3을 나눈 값은 %3.2f입니다.%n",h);
		
		
	}

}
