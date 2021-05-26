
public class Ex0511_07 {

	public static void main(String[] args) {
		look2:for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5) {
					break look2;
				}
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		
		
		
		
//		// 1~10 까지 출력을 하는데 3의 배수는 제외하시오 
//		
//		for(int i=0;i<=100;i++) {
//			if(i%5==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		for(int i=0;i<=10;i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}

	}

}
