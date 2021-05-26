
public class Ex0512_03 {

	public static void main(String[] args) {

		//구구단 출력  2*1=2, 2*3=6, 2*5=10 ..... 처럼
		// 홀수 번만 출력할수 있게 .
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {

//				if(j%2==0) {
//					continue;
					
				if(j>5) {
					break;
				}
				System.out.printf("%d * %d = %d %n",i,j,(i*j));
			}
			System.out.println();
		}
		
			
		
		
		
		
		
		//		double a = 14255.2345678;
//		int b = 100;
//		String str = "school"
//		System.out.println("println 출력 :"+a+","+b);
//		System.out.printf("prinf출력 : %09, %f, %d %n", a,b);  
//		//실수는 f, 정수는 d
//		System.out.printf("printf출력 : %d %n", b);
//		System.out.printf("printf출력 : %s %n", str);
//		
//		System.out.println(i+"*"+j+"="+

	}

}
