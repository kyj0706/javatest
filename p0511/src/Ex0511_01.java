import java.util.Scanner;

public class Ex0511_01 {

	public static void main(String[] args) {
		// 숫자 2.031457 입력 받아 5자리 반올림해서 출력 하시오
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요. >>");
		double num = scan.nextDouble();
		double result = Math.round(num * 10000)/10000.0;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요. >>");
//		int num = scan.nextInt();
//		scan.nextLine();//enter키 입력 
//		System.out.println("문자를 입력하세요. >>");
//		String str = scan.nextLine(); // 문자열 
//		System.out.println("출력 : " +num);
//		System.out.println("문자출력 : " +str);
		
		
		
		
		//문제 1
		// 숫자를 입력 받아 짝수인지. 홀수 인지 출력 하세요 (if문을 사용 할 것 )
//		System.out.println("숫자를 입력하세요");
//		int num = scan.nextInt();
//		
//		if(num % 2 ==0) {
//			System.out.println("숫자 :"+ num+"은(는) => 짝수 입니다. ");
//		}else {
//			System.out.println("숫자 :"+ num+"은(는) => 홀수 입니다.");
//		}
		
	}

}
