import java.util.Scanner;

public class Ex0512_01 {

	public static void main(String[] args) {
	
		Math.ceil(2.015);	//올림
		Math.round(2.015);	//반올림
		Math.floor(2.015);	//버림
		Math.max(10, 2);	//큰수를 출력
		Math.min(5, 15);	//작은수를 출력
		// 이거란 말이지 ? 
		
		
		// quiz 3
		// 출력힐 구구단 범위를 입력받아 출력하시오.
		// ex 2, 5 를입력했을때 2~9단까지 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력하세요.>>");
		int sta = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.>>");
		int end = scan.nextInt();
//		System.out.println("끝 숫자를 입력하세요.>>");
//		int want = scan.nextInt(); 
//		
		
		//비교 ?
		if(sta>end) {  // 이해 안됨 . 외워바 ..
			int i=0; 
			i = sta;
			sta = end;
			end = i;
		}
		
	
		for(int i=sta; i<=end; i++) {
			for(int j=2; j<=9; j++) {
				System.out.println(i+ " * " +j+ " = " + (i*j));
			}
			System.out.println();
		}
		
		
		
	
//		//quiz 2 200이 안넘을때
//		int i =0;
//		int sum=0;
//		
//		for(i=1;i<=100;i++) {
//			if(sum>=200) {
//				break;
//			}
//			sum += i;
//		}
//		System.out.println("순서 :" +(i-2));
//		System.out.println("합계 :" +(sum-(i-1)));
		
		
		
		
		
		//1~100까지 더하는 합계 값이 200이 넘는 최종값을 출력하시오.
		// 얼마까지 더하면 되는지 출력하세요.
		//quiz 1
		
//		int i=0;
//		int sum=0;
//		
//		for(i=1;i<=100;i++) {
//			if(sum>=200) {
//				break;
//			}
//			sum += i;
//		}
//		System.out.println("순차 : " +(i-1));
//		System.out.println("합계 : " +sum);
		
		
		
		
		
//		int i=1;
//		int sum=0;
//		
//		
//		while(true) {
//			if(sum>200) {
//				break;
//			}
//			
//			sum += i;
//			i++;
//			
//		}
//		System.out.println("순차 : " +(i-1));
//		System.out.println("합계 : " +sum);
				
		
		
		
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
//			}
//			System.out.println();
//		}

	}//main 

}//class
