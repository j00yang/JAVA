package exec;

import java.util.Scanner;

/* 조건문: 조건에 맞춰 구문을 실행
 * <if문> 
 * if(조건) {
 * 	//조건이 참일 때 수행될 내용
 * } else if {
 * 	//조건2가 참일 때 수행될 내용의 반대 내용
 * } else {
 * 	//조건이 참일 때 수행될 내용의 반대 내용
 * }
 * 
 */

public class test02 {

	public static void main(String[] args) {
	
		/*int x = 0;
		
		if (x == 0) {
			System.out.println("x는 0입니다.");
		} else if (x == 0) {
			System.out.println("x는 0입니다.");
		} else {
			System.out.println("x는 0이 아닙니다.");
		}
		*/
		
		
		/* 1. 스캐너로 숫자2개 입력 + 연산자
		 * 2. 연산 (if 4번 / else)
		 * 3. 결과값 출력
		 */
		
		
		/* int a = 0;
		int b = 0;
		int c = 0;
		int temp = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		a = scan.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		b = scan.nextInt();
		
		System.out.println("연산기호를 입력하세요.(1:+, 2:-, 3:*, 4:/)");
		c = scan.nextInt();
		
		if (c == 1) {
			System.out.println(a + b);
		} else if (c == 2) {
			if (a < b) {
				temp = b;
				b = a;
				a = temp;
			}
			System.out.println(a - b);
		} else if (c == 3) {
			System.out.println(a * b);
		} else if (c == 4) {
			System.out.println(a / b);
		} else {
			System.out.println("다시 입력하세요.");
		}*/
		
		
		int a = 0;
		int b = 0;
		int temp = 0;
		float result = 0;
		String msg = null;
		String c = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		a = scan.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		b = scan.nextInt();
		
		System.out.println("연산기호를 입력하세요.");
		c = scan.next();
		
		if (c.equals("+")) {
			msg = "입력결과: " + (a + b);
		} else if (c.equals("-")) {
			if (a < b) {
				temp = b;
				b = a;
				a = temp;
			}
			msg = "입력결과: " + (a - b);
		} else if (c.equals("*")) {
			msg = "입력결과: " + (a * b);
		} else if (c.equals("/")) {
			result = (float)a / b;
			msg = "입력결과: " + result;
		} else {
			msg = "다시 입력하세요.";
		}
	
		System.out.println(msg);
		
		
	}

}
