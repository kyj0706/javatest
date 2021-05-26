import java.util.Scanner;

public class Ex0513_01 {

	public static void main(String[] args) {
		// 학생 성적 프로그램 3명을 입력해서 출력을 해보세요
		// 이름 , 국어, 영어, 수학 을 입력받아
		// 이름 , 국어, 영어, 수학 ,합계, 평균을 출력해보세요
		// 1. 배열 만들기

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] mat = new int[3];
		int[] tol = new int[3];
		double[] avg = new double[3];

		for (int i = 0; i < name.length; i++) {
			System.out.println("학생정보");
			name[i] = scan.next();
			System.out.println("국어점수");
			kor[i] = scan.nextInt();
			System.out.println("영어점수");
			eng[i] = scan.nextInt();
			System.out.println("수학점수");
			mat[i] = scan.nextInt();
			tol[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tol[i] / 3.0;
		}
		
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " \t");
			System.out.print(kor[i] + " \t");
			System.out.print(eng[i] + " \t");
			System.out.print(mat[i] + " \t");
			System.out.print(tol[i] + " \t");
			System.out.printf("%.2f" + avg[i]);
		}

	}

}
