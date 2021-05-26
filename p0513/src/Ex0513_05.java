import java.util.Scanner;

public class Ex0513_05 {

	public static void main(String[] args) {
		// [0,0][0,1],[0,2]
		// [3] [3]  배열 먼저
		// 숫자를 입력 받아 원하는 배열을 만들어 보세요
		Scanner scan = new Scanner(System.in);
		System.out.println("1번 숫자");
		int in_arr1 = scan.nextInt();     	
		System.out.println("2번 숫자");
		int in_arr2 = scan.nextInt();
		
		
		
		String[][] arr = new String[in_arr1][in_arr2];
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = "["+i+","+j+"]";
				
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
