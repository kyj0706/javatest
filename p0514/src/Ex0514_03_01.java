import java.util.Scanner;

public class Ex0514_03_01 {

	public static void main(String[] args) {
		// 3명의 배열 생성
		// 학생이름 , 국어,영어,수학, 성적을 입력받아 => 합계 , 평균을 출력하시오
		
		Scanner scan = new Scanner(System.in);
		//1. 배열생성
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		
		//1-1 이름 , 점수 입력 
		for(int i=0; i<score.length; i++) {
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			for(int j=0; j<score[i].length-1;j++) {
				System.out.println("점수를 입력하세요.>>");
				score[i][j] = scan.nextInt();
			}// 이름 입력 for 1
			score[i][3] = score[i][0] +score[i][1] +score[i][2];
			avg[i] = score[i][3]/3.0;
			
		}//점수입력 for2
		System.out.println();
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length-1;j++) {
				System.out.print(score[i][j]+"\t");
			}// 이름 입력 for 1
			//System.out.printf();
		}//점수입력 for2

	}

}
