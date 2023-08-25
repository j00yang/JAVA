package exec;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		
		
		//00-01 복습
		int sum=0;
		
		for(int i=1;i<=53;i++) {
			if (i%4!=0) {
				System.out.printf("%d ",i);
			} else {
				sum+=i;
				//println?
			}	//println?
		}
		System.out.println();
		System.out.printf("4의 배수의 합: "+sum+"%n");
		
		//00-02
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("===================%n주민번호를 입력하세요.%nex)900812-1234567%n(종료시 'exit' 입력)%n");
		
		for(;;) {
			System.out.printf("===================%n주민번호를 입력하세요.%n");
			String regNo = scan.nextLine();
			
			if (regNo.equals("exit")) {
				System.out.printf("종료합니다.");
				break;
			} else {
				switch (regNo.charAt(7)) {
				case '1','3':
					System.out.printf("성별은 남자입니다.%n");
					break;
				case '2','4':
					System.out.printf("성별은 여자입니다.%n");
					break;
				default:
					System.out.printf("다시 입력해주세요.%n");
				}
				
			}
				
		}
		
		System.out.println("주민번호를 입력하세요.");
		switch (regNo.charAt(7)) {
			case '1','3':
				System.out.println("남자");
				break;
			case '2','4':
				System.out.println("여자");
			default:
				System.out.println("다시 입력해주세요.");
		}
		
		
		//00-02-02
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("주민번호를 입력하세요.");
		System.out.println("ex)000521-4123569");
		System.out.println("(종료시 'exit' 입력)");
		
		for(;;) {
			System.out.println("==================");
			System.out.println("주민번호를 입력하세요.");
			String regNo = scan.nextLine();
			
			if (regNo.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}  int reg = regNo.charAt(7);
				switch(reg) {
					case '1','3':
						System.out.println("남자입니다.");
						break;
					case '2','4':
						System.out.println("여자입니다.");
						break;
					default:
						System.out.println("다시 입력하세요."); 
				}
			}	
		
		
		//00-03
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i\t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");
		for(int i=1;i<=10;i++) {
			System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\t %d\t %n",i,2*i,2*i-1,i*i,11-i,i%3,i/3);
		}
	
		
		
		//01 구구단 2단~9단
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf(i+" * " +j+" = "+i*j+"\t"); 
			}
			System.out.println();
		}
		
		
		//02-01 : * 5행5열
		System.out.println("2번문제");
		for(int i=1;i<=5;i++) {
			System.out.println("*****");
		}
		System.out.println();
		
		//02-02 : * 5행5열 (print("*"))
		System.out.println("3번문제");
		for (int j=1;j<=5;j++) {
			for(int k=1;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println();
		
		//02-04
		System.out.println("4번문제");
		for (int l=1;l<=4;l++) {
			for(int m=1;m<=4;m++) {
				System.out.print("*");
				if(m==l) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//02-05
		System.out.println("5번문제");
		for (int n=5;n>=1;n--) {
			for(int o=1;o<=5;o++) {
				System.out.print("*");
				if(n==o) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//02-06 +
		System.out.println("5번문제-2");
		for (int n=1;n<=5;n++) {
			for(int o=5;o>=1;o--) {
				System.out.print("*");
				if(n==o) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

}
