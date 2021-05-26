import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		//1.화면단 출력 = while(), switch()구문 먼저 만들것
		//2. 학생성적 추가 부분을 구현 
		//-> 각각의 저장 배열을 생성 
		//-> 이름, 국어, 영어, 수학점수 입력받음 
		//-> 합계, 평균, 입력
		//3. 학생성적출력을 구현
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] sject = {"국어","영어","수학"};
		//int connt=0;
		
		
		while(true) {
			System.out.println("[성적관리]");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적출력");
			System.out.println("원한는 번호 입력");
			int cho = scan.nextInt();
			
			
			
			switch(cho) {
				case 1: // 1. 학생성적 추가
					System.out.println("=====>학생성적추가 메뉴");
					for(int i=0; i<score.length; i++) {
						System.out.println("학생이름");
						name[i] = scan.next();
						
						
						for(int j=0; j<score[i].length-1; j++) {
							System.out.println(sject[j] + "점수를 입력해주세요");
							score[i][j] = scan.nextInt();
						}
						score[i][3] = score[i][0] +score[i][1] +score[i][2];
						avg[i] = score[i][3]/3.0;
						
					}
					
					
					break;

				
				
				case 2: // 2.학생성적 출력 
					System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
					for(int i=0; i<score.length; i++) {
						System.out.print(name[i]+"\t");
						
						for(int j=0; j<score[i].length; j++) {
							System.out.print(score[i][j]+"\t");
							
						}
						System.out.printf("%2.0f \n",avg[i]);
					}
					System.out.println();
					break;
					
				
				
				default:
					break;
					
			}//switch
		}//while
		
	}//main

}//class
