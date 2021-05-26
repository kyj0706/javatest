import java.util.Scanner;

public class Ex0518_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두수를 입력하세요.>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt(); // 여기는 지정을 해줘야한다.
		
		int result = add(num1,num2);
		
		System.out.println("데이터 : "+result);
		
	}//main메소드 
		 //???    매개변수
	static int add(int num1,int num2) {//요기 매개변수는 정의를 내려줘야한다.
		int result = num1+num2;
		return result;
	}
	
	
	
//	static int max(int num1,int num2) { // 이걸 왜라고 설명하지 .. . 위의 변수와 지금 변수는  같으나 다른변수이다 .
//		int result = 0;
//		if(num1>num2) {
//			result = num1;
//		}else {
//			result = num2;
//		}
//		return result;
//	}

}

//		// for문을 두개 쓸수 있는 이유 지역번수  
//		for(int i=0; i<10; i++) { 
//			num1 += i;
//		}
//		//여기를 벗어나는 순간 위에 i는 사라지기 때문에 새로운 녀석이 생성 
//		for(int i=0; i<11; i++) {
//			num1 += i;
//		}