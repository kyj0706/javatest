import java.util.Scanner;

public class Ex0520_07 {

	public static void main(String[] args) {
		// 두수를 입력받아 ->cal() 메소드 호출
		// cal () -> 더하기, 빼기, 곱하기 , 나누기를 해서 리턴 받음

		Scanner scan = new Scanner(System.in);
		//
		SignData s = new SignData();
		
		System.out.println("두수를 입력하세요");

		s.num1 = scan.nextInt();
		s.num2 = scan.nextInt();
		
		System.out.println("main 메소드 : "+ s);
		cal(s); // 아래 지역변수에 SignData = 주소값을  보내버릴꺼야 !! 

		System.out.println("두수 더하기 :" +s.result1);
		System.out.println("두수 빼기 : " +s.result2);
		System.out.println("두수 곱하기 : " +s.result3);
		System.out.println("두수 나누기 : " +s.result4);

	}
//지역변수
	static void cal(SignData s1) { // void에 자리에는 타입을 주는건데 SignData s이렇게 메소드로 가지고 왔기땜 문에 
									// void가 되는거다
		
		System.out.println("cal메소드 : " +s1);
		 s1.result1 = s1.num1 + s1.num2;
		 s1.result2 = s1.num1 - s1.num2;
		 s1.result3 = s1.num1 * s1.num2;
		 s1.result4 = s1.num1 / s1.num2;

	}

}
