import java.util.Scanner;

public class Ex0520_05 {

	public static void main(String[] args) {
		// 두수를 입력받아 더하기를 해서 결과값을 출력하시오.
		//main() -> 입력 add 메소드 호출
		//add() -> 두수를 더해서 return해서 돌려줌 
		//sub()빼기,
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자 입력");
		int num2 = scan.nextInt();
		
		
		
		int result = add(num1, num2);
		int result2 = sub(num1, num2);
		int result3 = multi(num1, num2);
		int result4 = div(num1, num2);
		System.out.println("두수의 더하기 결과값 :"+result);
		System.out.println("두수의 빼기 결과값 :" + result2);
		System.out.println("두수의 빼기 결과값 :" + result3);
		System.out.println("두수의 빼기 결과값 :" + result4);
		
	}
	static int add(int num1, int num2) {
		int result = num1+num2;
		
		return result;	
	}
	static int sub(int num1, int num2) {
		int result2 = num1+num2;
		
		return result2;	
	}
	static int multi(int num1, int num2) {
		int result3 = num1*num2;
		
		return result3;	
	}
	static int div(int num1, int num2) {
		int result4 = num1/num2;
		
		return result4;	
	}

}
