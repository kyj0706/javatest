import java.util.Scanner;

public class Ex0520_03 {
	// 공통사용하기 위한 목적
	static Scanner scan = new Scanner(System.in); // static을 쓰면 가능하다 ?

	public static void main(String[] args) {// 지역변수

		System.out.println("1번째 데이터를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("2번째 데이터를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("[사칙연산을 선택]");
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
		System.out.println("번호를 선택해주세요.");
		int sign = scan.nextInt();
		
		String name = "";
		switch (sign) {
		case 1:
			name="더하기";
			
			break;
		case 2:
			name="뺴기";
			
			break;
		case 3:
			name="곱하기";
			
			break;
		case 4:
			name="나누기";
			
			break;

		default:
			break;
		}
		
		
		//메소드 호출
		double result = calculation(num1, num2, sign);
		
		//뭘 선택했는지 보이게 해라 ?
		System.out.print(name);  
		System.out.println("사칙연산 결과값 : "+result);
		
	}
	//사칙연산 메소드 
	//메소드를 나누는 이유 
	//1. 반복되는 소스코드를 줄이기 위해서
	//2. 오류를 찾거나 줄이기 위해서 
	static double calculation(int num1, int num2, int sign) {

		double result = 0;	
		switch (sign) {
		case 1:// 더하기
			result = num1 + num2;

			break;
		case 2:// 빼기
			result = num1 - num2;

			break;
		case 3:// 곱하기
			result = num1 * num2;

			break;
		case 4:// 나누기
			result = num1 / num2;

			break;

		}// switch
		return result;

	}// main

}// class
