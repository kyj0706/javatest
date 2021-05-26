import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) {// 매개변수 main 메서드는 무조건 1개
		// 번호, 시(0-23), 분(0-59), 초(0-59.999) 까지 를 입력받아 출럭하시오.
		// 방법1 time[3][3], second[3]
		// 방법2 int[]num ,int[] hour,int[] minute, double[] second
		// 3개를 력받아 출력을 해보세요,
		// 시간은 수정이 가능하게 해보세요
		// 1.시간추가
		// 2.시간출력
		// 3.시간수정

		Scanner scan = new Scanner(System.in);

		int[] num = new int[3];
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];
		

		while (true) {
			System.out.println("[시간 프로그램");
			System.out.println("1.시간을 입력하세요");
			System.out.println("2.시간 출력");
			System.out.println("3 시간 수정");
			System.out.println("원하는 번호를 입력하세요.>>");
			//System.out.println("");
			
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("[시간 추가 메뉴]");
				for(int i=0; i<hour.length; i++) {
					System.out.println("시간를 입력하세요");
					num[i] = scan.nextInt();
					System.out.println("분 입력하세요");
					hour[i] = scan.nextInt();
					System.out.println("초를 입력하세요");
					minute[i] = scan.nextInt();
					System.out.println("0.000 초를 입력하세요");
					second[i] = scan.nextDouble();
					
				}
				
				
				break;
			case 2:
				System.out.println("[시간 출력 메뉴]");
				for(int i=0; i<hour.length; i++) {
					System.out.print(num[i] +" : ");
					System.out.print(hour[i] +" : ");
					System.out.print(minute[i]+" : ");	
					System.out.print(second[i]+"\n");
				
					
				}
				break;
			case 3:
				System.out.println("[시간 수정 메뉴]");
				break;

			default:
				break;
			}
		}

	}

}
