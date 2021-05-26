import java.util.Scanner;

public class Ex0512_05 {

	public static void main(String[] args) {
		// 5명의 학생의 이름, 국어, 영어 수학 점수를 입력받아 
		//이름,국어,영어, 수학, 합계, 평균을 출력하십시요
		
		Scanner scan = new Scanner(System.in);
		
		String [] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		int[] rank = new int[5]; // 등수
		
		//입력
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			System.out.println("국어점수.>>");
			kor[i] = scan.nextInt();
			System.out.println("영어점수.>>");
			eng[i] = scan.nextInt();
			System.out.println("수학점수.>>");
			mat[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+mat[i];
			avg[i] = total[i]/3.0;
				
		}
		System.out.println("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t");
		System.out.println("---------------------------------");
		
		//출력
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(kor[i]+"\t");
			System.out.print(eng[i]+"\t");
			System.out.print(mat[i]+"\t");
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
		
	}//main

}//class
