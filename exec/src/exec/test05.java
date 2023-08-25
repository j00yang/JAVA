package exec;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// /,%연산자, 삼항연산자
		
	
		//
		/* Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}  */
		
		
		//#0 (if문)
		/* int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = 0; //모든 사과를 담는 데 필요한 바구니의 수
		
			if (numOfApples % sizeOfBucket == 0) {
				numOfBucket = numOfApples/sizeOfBucket;
			} else {
				numOfBucket = (numOfApples/sizeOfBucket)+1;
			}
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket); */
		
		
		//#1
		/* int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ((numOfApples % sizeOfBucket==0) ? (numOfApples/sizeOfBucket) : (numOfApples/sizeOfBucket)+1); //모든 사과를 담는 데 필요한 바구니의 수
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket); */
		
		
		//#2
		/* 
		Scanner scan = new Scanner(System.in);
		
		int numOfApples = 0; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		
		System.out.println("사과의 개수를 입력하세요.");
		numOfApples = scan.nextInt(); //모든 사과를 담는 데 필요한 바구니의 수
		numOfBucket = ((numOfApples % sizeOfBucket>0) ? (numOfApples/sizeOfBucket)+1 : (numOfApples/sizeOfBucket));
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket); */
		
		// apple/bucket +(apple%bucket==0?0:1);
		/* int number = apple/bucket;
		
		if (apple/bucket !=0) {
			number = number + 1 */
		
		//#3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int a = scan.nextInt();
		
		if (a%2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		
		//#4
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int a = scan.nextInt();
		String x = "짝수";
		String y = "홀수";
		
		System.out.println(a%2==0?x:y); */
		
		
		
		
		
	}

}
