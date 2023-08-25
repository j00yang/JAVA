package exec;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		
		
		//0 복습
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
		
		//0-2
		/* Scanner scan = new Scanner(System.in);
		
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
				
		} */
		
		/* System.out.println("주민번호를 입력하세요.");
		switch (regNo.charAt(7)) {
			case '1','3':
				System.out.println("남자");
				break;
			case '2','4':
				System.out.println("여자");
			default:
				System.out.println("다시 입력해주세요.");
		} */
		
		
		//0-2-2
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
		
		
		
		
		
		
		//0-3
		/* System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i\t i%3 \t i/3");
		System.out.println("-----------------------------------------------------");
		for(int i=1;i<=10;i++) {
			System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\t %d\t %n",i,2*i,2*i-1,i*i,11-i,i%3,i/3);
		}
		*/
		
		
		
		
		
		
		
		
		

	}

}
