package exec;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		
		switch(score) {
			case 100: case 99: case 98: case 97:  
				System.out.println("A+");
				break;
			case 96: case 95: case 94: case 93: case 92: case 91: case 90:
				System.out.println("A");
				break;
			case 89: case 88: case 87:  	
				System.out.println("B+");
				break;
			case 86: case 85: case 84: case 83: case 82: case 81: case 80:
				System.out.println("B");
				break;
			case 79: case 78: case 77: 
				System.out.println("C+");
				break;
			case 76: case 75: case 74: case 73: case 72: case 71: case 70:
				System.out.println("C");
				break;
			default:
				System.out.println("F");
				
		} 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		
		switch(score/10) {
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default:
				System.out.println("F");
				
		}	

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		
		switch(score/10) {
			case 10:
				switch (score) {
					case 100:
						System.out.println("A+");
						break;
					default:
						System.out.println("0~100 사이의 수를 입력해주세요.");
				}
				break;
			case 9:
				System.out.print("A");
				switch(score) {
					case 99: case 98: case 97:
						System.out.println("+");
						break;
					default:
						System.out.println("");
				}
				break;
			case 8:
				System.out.print("B");
				switch(score) {
				case 89: case 88: case 87:
					System.out.println("+");
					break;
				default:
					System.out.println("");
				}
				break;
			case 7:
				System.out.print("C");
				switch(score) {
				case 79: case 78: case 77:
					System.out.println("+");
					break;
				default:
					System.out.println("");
				}
				break;
			case 6: case 5: case 4: case 3: case 2: case 1: 
				System.out.println("F");
				break;
			case 0:
				switch(score) {
					case 0:
						System.out.println("F");
						break;
					default:
						System.out.println("0~100 사이의 수를 입력해주세요.");
				}
				break;
			default:
				System.out.println("0~100 사이의 수를 입력해주세요.");
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		int hak = score/10;
		int opt = score%10;
		char hakNum = ' ';
		char optNum = ' ';
		int gb = 0;
		
		switch(hak) {
			case 10:
				hakNum = 'A';
				optNum = '+';
				break;
			case 9:
				hakNum = 'A';
				gb = 1;
				break;
			case 8:
				hakNum = 'B';
				gb = 1;
				break;
			case 7:
				hakNum = 'C';
				gb = 1;
				break;
			default:
				hakNum = 'F';		
		}
		
		if(gb==1 && opt>=7) {
			optNum = '+';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n",hakNum,optNum);
		
		
		
		//주민번호를 입력받아서 남자인지 여자인지 출력하기 ex) regNo.charAt(7))
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String regNo = scan.nextLine();
		
		switch(regNo.charAt(7)) {
			case '1': case '3':
				System.out.println("남자");
				break;
			case '2': case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("다시 입력하세요.");
		}
		
		
		// 난수구하기 (p.151)
		// 0.0 <= Math.random() < 1.0
		// 1 <= (int) (Math random()*3) +1 < 4
		
		
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		for(int i=1;i<=5;i++) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		// 0부터 9까지
		for(int i=0;i<10;i++) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		// 1부터 10까지의 수 중 3의 배수
		for(int i=1;i<=10;i++) {
			if (i%3==0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println(); 
		
		//1~20 중 짝수의 합
		int sum = 0;
		
		for(int i=1;i<=20;i++) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.print(sum);
		System.out.println();
		

		//10부터 1까지
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		//구구단 2단 
		for(int i=1;i<=9;i++) {
			System.out.println("2 * " + i + " = " + i*2); */
		}
		
	}

