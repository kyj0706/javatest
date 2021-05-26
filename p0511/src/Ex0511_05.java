
public class Ex0511_05 {

	public static void main(String[] args) {

		// 1~100까지 에서 
		// 홀수만 더해서 200이 넘는 sum 값과 숫자 번호를 출력해보세요.
		
		int i=1;
		int j=0;
		int sum=0;
		
		while(true) {
			if(sum>200 && i<=100) {
				break;
			}
			j++;
			sum += i;
			i+=2;
		}
		System.out.println("순자 :" +j);
		System.out.println("합계 : " +sum);
		
		
		//1~100까지 합계가 500이 넘어가는 시점의 숫자와 합계를 구하세요.
//		int i=0;
//		int sum=0;
//		
//		while(true) {
//			if(sum>500) {
//				break;
//			}
//			i++;
//			sum = sum +i;
//		}
//		System.out.println("순차 :" +i);
//		System.out.println("합계 :" +sum);
		
		
		
		
//		int i=0;	// 순차번호
//		int sum=0; 	// 합계초기화
//		
//		while(true) { 	//무한 반복 for(;;) 와 같은 녀석
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("순자번호 : " +i);
//		System.out.println("합계 : "+sum);
		
		
		
		
		
		
		//000
		//001
		//002
		//003
		//.....
		//999
		// 3중 for 문을 쓰면 된다 ?
		
		
//		for(int i=0;i<=9;i++) { 
//			for(int j=0;j<=9;j++) { 
//				for(int k=0;k<=9;k++) { 
//					System.out.println(""+i+j+k);
//				}	
//			}
//		}
				
		
	}

}
