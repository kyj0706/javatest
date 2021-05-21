
public class Ex0521_05 {

	public static void main(String[] args) {
		//지역변수는 초기화를 무조건 해줘야 한다.
		String num = "";
		int count=0;
		// 이렇게 넣고 싶다  S001 ,S002
//		System.out.printf("%d \n",5);
//		System.out.printf("￦%07d \n",12345678); 
//		System.out.printf("%,07d \n",123456789); 
//		
//		System.out.printf("%07.2f \n",78.123545); // 소수점 2재짜리 까지 출력하세요 ~ 
//		System.out.printf("%10s \n","더좋은"); // 문자열 출력 ===== 더좋은 ==== 
		
		String str_num = "S"+String.format("%04d", ++count); //얘는 뭐냐 printf("%d",)
		
		System.out.println(str_num);

	}

}
