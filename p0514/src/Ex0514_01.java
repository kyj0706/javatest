
public class Ex0514_01 {

	public static void main(String[] args) {
	      //1차원 배열 30개생성 랜덤으로 1~100까지 숫자를 넣어 만들어 보세요 .
	      // 1차원 40개 짜리 배열을 생성해서 배열  5번째방부터 20개만 복사해보세요 .
	      //for문, arraycopy 메소드 2가지를 모두 사용 
	      
	      int number [] = new int [30];
	      int [] newNumber = new int[40];

	      
	      
	      //for 문 배열복사 랜덤으로 1~100까지 숫자를 넣어 만듬
	      for(int i = 0; i<number.length;i++) {
	         number[i]=(int)(Math.random()*100)+1;
	      }
	      
	      for(int i = 4; i<24;i++) {// 0,1,2,3,4 for 문을 사용한 배열 복사 
	         newNumber[i-4]= number[i];
	      }
	      //arraycopy 메소드 배열복사 
	      System.arraycopy(number, 4, newNumber, 0, 20);
	      
	      //출력
	      for(int i = 0; i<number.length;i++) {// 0,1,2,3,4
	         System.out.println(newNumber[i]);
	      }
	      
	      
	      
	      
//	      //배열복사 
//	      
//	      int [] number = {1,2,3,4,5};
//	      int [] newNumber = new int [10];
//	      // 카피 방법 ==새로운 배열에 넣는다 null 값들이있는
//	      //system.arraycopy() 메소드 사용해서 배열 복사 
//	      System.arraycopy(number, 1, newNumber, 3, 2);
//	      
//	      //for문을 사용한 배열 복사
//	      //      for(int i=0; i<number.length; i++) {
////	         newNumber[i] = number[i]; 
////	      
////	      }
//	      for(int i=0; i<newNumber.length; i++) {
//	         System.out.println(newNumber[i]);
//	      }
	//   
	   }//

	}
