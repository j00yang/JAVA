package exec;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//계산기
		
		/* int a = 0;
		int b = 0;
		int temp = 0;
		int result = 0;
		String c = "";
		String msg = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		a = scan.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		b = scan.nextInt();
		
		System.out.println("연산기호를 입력하세요.");
		c = scan.next();
		
		if (c.equals("+")) {
			result = a + b;
			msg = "입력결과 : " + result;
		} else if (c.equals("-")) {
			if (a < b) {
				temp = b;
				b = a;
				a = temp;
			}
			result = a - b;
			msg = "입력결과 : " + result;
		} else if (c.equals("*")) {
			result = a * b;
			msg = "입력결과 : " + result;
		} else if (c.equals("/")) {
			result = a / b;
			msg = "입력결과 : " + result;
		} else {
			msg = "연산기호를 다시 입력하세요.";
		}
		
		System.out.println(msg);*/
		
		
		//학점처리
		
		int a = 0;
		String grade = "";
		String opt = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		a = scan.nextInt();
		
		if (a >= 90) {
			grade = "A";
			if (a >= 97) {
				opt = "+";
			}
		} else if (a >= 80) {
			grade = "B";
			if(a >= 87) {
				opt = "+";
			}
		} else if (a >= 70) {
			grade = "C";
			if (a>=77) {
				opt = "+";
			}
		} else if (a < 70) {
			grade = "F";
		} 
		
		System.out.printf("당신의 학점은 %s%s입니다.%n", grade, opt); 
		
		
		/*Scanner scan = new Scanner(System.in);
	      System.out.println("학점계산기");
	      System.out.print("이름 :");
	      String name = scan.next();
	      System.out.print("과목 :");
	      String subject = scan.next();
	      System.out.print("점수 :");
	      int score = scan.nextInt();
	      int a = score % 10;
	      String msg = "";
	      
	      
	      if (score>=90) {msg="A";}
	      else if (score>=80) {msg="B";}
	      else if (score>=70) {msg="C";}
	      else {msg="F";}

	      if ((a>=7&&score>=70) || score==100) {msg = msg+"+";}
	      
	      System.out.printf(name+ " 님의 " +subject+ " 학점은 " +msg+" 입니다.");
		*/
	
	
	}

}
