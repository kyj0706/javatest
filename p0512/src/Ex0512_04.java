import java.util.Scanner;

public class Ex0512_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//번외
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		//입력
		for(int i=0; i<name.length;i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math[i] = scan.nextInt();
			total[i] = kor[i] +eng[i] +math[i];
			avg[i] = total[i]/3.0;
		}
		//출력
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
			System.out.print(kor[i]+"\t");
			System.out.print(eng[i]+"\t");
			System.out.print(math[i]+"\t");
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
			
			
			
		//문제 
		// kor int 5개 만들어서 100점을 넣어 보세요 
		
//		int[] kor = new int[5];
//			kor[0] = 100;
//		for(int i=0; i<5;i++) {
//			System.out.println(kor[0]);
//		}
		
		
		
		
		
		
		
		//length란 
		
//		int[] score = new int[6]; // 배뎔 선언 방법 1
//		scroe[0] = 100;
//		scroe[1] = 90;
//		scroe[2] = 80;
//		scroe[3] = 70;
//		scroe[4] = 60;
//		
		//그래서 length가 있다.
//		int[] score= {100,90,80,70,60,50}; //배열 선언 방법 2
//		for(int i=0;i<score.length;i++) {  //종료값이 배열 수와 값아야 한다 . 안그러면 에러가 난다.
//			System.out.println(score[i]);
//		}
//		
		
		
//		int[] score= {100,90,80,70,60,50}; //배열 선언 방법 2
//		for(int i=0;i<6;i++) {  //종료값이 배열 수와 값아야 한다 . 안그러면 에러가 난다.
//			System.out.println(score[i]);
//		}
//		
		
		
		
		
		
		
		
		//number int 배열을 3개 선언해서 1~3까지 입력하시요.
		// 타입은 무조건 int이다 .
//		int[] number = new int[3];
//		number[0]=1;
//		number[1]=2;
//		number[2]=3;
//		
//		int[] number2= {1,2,3};
//		
//		int[] num = new int[100];
//		for(int i=0;i<100;i++) {
//			num[i]=i+1;
//		}
//		for(int i=0;i<100;i++) {
//			System.out.println(num[i]);
//		}
		
		
		// 배열 선언 하는 방법
//		int num=0;
//		int[] score = new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
//		
//		if(score[0]==1) {
//			System.out.println("score[0]의 값은 1입니다.");
//		}
//		
//		
//		System.out.println(score[0]);

	}//main

}//class
