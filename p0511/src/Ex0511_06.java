import java.util.Scanner;

public class Ex0511_06 {

	public static void main(String[] args) {
		// 1~100까지 난수를 생성해서
		// 무한 반복해서 번호를 맞출때 break 문으로 빠져 나오세요.
		// 정답 숫자를 출력시오.
		Scanner scan = new Scanner(System.in);
		int score = (int)(Math.random()*100)+1;
		
		int num=0;
		while (true) {
			System.out.println("맟춰보시게 ~");
			num = scan.nextInt();
			if(num==score) {
				System.out.println("정답");
				break;
			}else if(num>score) {
				System.out.println("틀렸습니다.!");
				System.out.println(num+"보다 작은수");
			}else {
				System.out.println(num+"보다 큰수");
			}
		}
		System.out.println("정답은 : " +num);
		
		
		
		

	}

}
