package p0616;

import java.util.Scanner;

public class Ex0616_07_t {

	public static void main(String[] args) {
		
		//당첨번호 int 배열
		int[] inputNum = new int[6];
		char [] ch = new char[6];
		//복권입력 
		Scanner scan = new Scanner(System.in);
		System.out.println("복권번호를 입력하세요.(ex>1조12345)>>");
		String input = scan.next();//1조01234
		//int 배열에 담기
		for(int i=0; i<=inputNum.length;i++) {
			if(i==0) {
				inputNum[i] = input.charAt(i)-'0'; //1| |01234
			}else if(i==1) {
				continue;
			}
			else { //2,3,4,5,6
				inputNum[i-1] = input.charAt(i)-'0'; //101234
			}
				
		}
		//복권당첨번호 생성
		int[] num = new int[6];
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10);
		}
		//당첨개수 확인
		int count=0;
		for(int i=0; i<num.length;i++) {
			if(inputNum[i]==num[i]) {
				ch[i] ='o';
				count++;
			
			}else {
				ch[i] = 'x';
			}
		}
		
		//입력번호 출력
		System.out.println(inputNum[0]+"조"+inputNum[1]+inputNum[2]+inputNum[3]+inputNum[4]+inputNum[5]);
		//당첨번호 출력
		System.out.println(num[0]+"조"+num[1]+num[2]+num[3]+num[4]+num[5]);
		System.out.println("-----------------------------------------------");
		System.out.println(ch[0]+"조"+ch[1]+ch[2]+ch[3]+ch[4]+ch[5]);
		
		System.out.println("당첨 개수 :" + count);
	}

}
