import java.util.Scanner;

public class Ex0513_06 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
         // ball
         int[] ball = new int[25];
         for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
         }
         int temp = 0;
         int ran = 0;
         for (int i = 0; i < 200; i++) {
            ran = (int) (Math.random() * 25);

            temp = ball[0];
            ball[0] = ball[ran];
            ball[ran] = temp;
         }
         int[][] num = new int[5][5];
         int count =0; //ball 의 배열번호로 사용되는 변수 
         
         
         for (int i = 0; i < num.length; i++) {
            for (int j= 0; j < num[i].length; j++) {
               num[i][j] = ball[count];
               count ++;
            }
         }
         
         
      // 무한 반복
      while (true) {
    	  // 배열출력 
    	  System.out.printf("번호\t[0]\t[1]\t[2]\t[3]\t[4]\n");
    	  System.out.println("--------------------------------------------");
    	  for (int i = 0; i < num.length; i++) {
    		  System.out.print("["+i+"]\t");
    		  for (int j= 0; j < num[i].length; j++) {
    			  System.out.print(num[i][j]+"\t");
    		  }
    		  System.out.println();
    		  
    	  }
         
    	  // 번호입력
    	 System.out.println("0-4까지 숫자를 입력하세요>>");
         int input1 = scan.nextInt();
         System.out.println("0-4까지 숫자를 입력하세요>>");
         int input2 = scan.nextInt();
         System.out.println("입력 "+input1+","+input2);
         
         //입력한 값 [0,1] ->0 을 넣는다 ?
         num[input1][input2]=0;

        }
      
      
      

   } //main
}// class
		
