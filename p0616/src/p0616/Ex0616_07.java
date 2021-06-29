package p0616;

import java.util.Scanner;

public class Ex0616_07 {

	public static void main(String[] args) {
		// 복권 1조14235 -> 0~9까지 가능 
		// 마지막 자리 -> 1천원
		// 2자리 ->1만원
		// 3자리 ->10만원
		// 4자리 ->100만원
		// 5자리 ->1000만원
		//1번째 랜덤으로 숫자를 생성해서 1조12345  복권번호를 생성해 보세요
		// 복권번호 : 9조 4558, 3조1115, 5조1289... 뭐 이련
		
		//데이터를 입력받아 숫자사 몇개 맞는지를 출력하시오
		
		Scanner scan = new Scanner(System.in);
		
		int[] sel = new int[6];
		int[] num = new int[6];
		
		for(int i=0; i<sel.length; i++) {
			System.out.println((i+".") + "구매합니다.");
			sel[i] = scan.nextInt();
	
		}
		System.out.println("구매 번호 : " +sel[0]+"조" +sel[1]+ sel[2]+ sel[3]+ sel[4]+ sel[5]);
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10);
		}
		System.out.println("당첨 번호 : " +num[0]+"조" +num[1] +num[2] +num[3] +num[4] +num[5]);
		
		
		
		
		int count =0;
			for(int i=0; i<num.length; i++) {
				if(sel[i] == num[i]) {
					count++;
					
				}
			}
		
		System.out.println("당첨번호 확인");
		for(int i=0; i<count; i++) {
		}
		System.out.print("당첨개수 "+count);
		
		
		
		
		
		
//		int[] num = new int[6];
//		int[] num2 = new int[10];
//		for(int i=0; i<num.length; i++) {
//			num[i] =(int)(Math.random()*10);
//			for(int j=0; j<num2.length; i++) {
//				num2[i] =(int)(Math.random()*10);
//				System.out.println(num[0]+"조");
//			}
//		}
		
//		int num1 = (int)(Math.random()*6);
//		int num2 = (int)(Math.random()*10);
//		int num3 = (int)(Math.random()*10);
//		int num4 = (int)(Math.random()*10);
//		int num5 = (int)(Math.random()*10);
//		int num6 = (int)(Math.random()*10);
//		int num7 = (int)(Math.random()*10);
//		//int num =(int)(Math.random()*100000);
//		
//		System.out.println(num1+"조"+num2+num3+num4+num5+num6+num7);
		
		
		
		
	}

}
