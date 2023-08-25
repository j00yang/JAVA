package exec;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 학점 처리
 * 1. 사용자에게 점수 입력받기
 * 2. 점수에 따라 학점 부여하기
 * 3. 사용자가 입력한 점수에 따른 학점 출력하기
 * 90점 이상: A학점
 * 80점 이상: B학점
 * 70점 이상: C학점
 * 그 이하: F학점
 */
		
	/*int 점수 = 0;
	String msg = "";
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("점수를 입력하세요.");
	점수 = scan.nextInt();
	
	if (점수 >= 90) {
		msg = "A";
	} else if (점수 >= 80) {
		msg = "B";
	} else if (점수 >= 70) {
		msg = "C";
	} else {
		msg = "F";
	}
	
	System.out.printf("당신의 학점은 %s입니다.",msg); */
	
	
	
	int 점수 = 0;
	String msg = "";
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("점수를 입력하세요.");
	점수 = scan.nextInt();
	
	if (점수 >= 90 && 점수 <=100) {
		msg = "A";
	} 
	if (점수 >= 80 && 점수 < 90) {
		msg = "B";
	} 
	if (점수 >= 70 && 점수 < 80) {
		msg = "C";
	} 
	if (점수 > 0 && 점수 < 70) {
		msg = "F";
	}
	
	System.out.printf("당신의 학점은 %s입니다.",msg);
	
	
	
	}

}
