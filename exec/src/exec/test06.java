package exec;

public class test06 {

	public static void main(String[] args) {
		

		System.out.println("1"+"2"); 	//문자 
		System.out.println(true+"");
		System.out.println('A'+'B'); 	//ASCII 코드 값 65+66 
		System.out.println('1'+ 2);	//1의 ASCII코드 값 +2 
		System.out.println('1'+'2'); 
		System.out.println('J'+"ava"); //큰 타입으로 변환: 문자->문자열 
		//System.out.println(true+null); //오류
		 

		byte b = 10;
		//b = (byte)i; 			// 정수(1바이트)->문자(2바이트): 형변환 필요

		char ch = 'A'; 
		ch = (char)b; 			// 문자(2바이트)->정수(1바이트): 형변환 필요
		  
		short s = (short)ch; 	// 정수(2바이트)->문자(2바이트): 형변환 필요
		  
		//float f = (float)l; 	// 실수(4바이트)->정수(long,8바이트): 생략 가능
		  
		int i = 100; 
		i = (int)ch; 		// 정수(4바이트)->문자(2바이트): 생략 가능
		
		
		
		
		
	}

}
