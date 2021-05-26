
import java.util.Scanner;

public class Ex0524_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Point[] in_point = new Point[3];
		
		//좌표 3개 입력받음.
		for(int i=0;i<in_point.length;i++) {
			in_point[i] = new Point(); //Point 객체생성
			System.out.println("1번째 X좌표를 입력하세요.");
			// 0,0 으로 받고 싶을때 
			String input = scan.next();
			String[] str = input.split(","); // split => ,(쉼표)를 기준으로 배열로 내놔 ~ !
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			in_point[i].x = Integer.parseInt(str[0]); 
			in_point[i].y = Integer.parseInt(str[1]); 
			// 이녀석 ~~ String을 -> int로 변환 시켜줌, 반대 0+"" -> String 으로
			
			
			
			//in_point[i].x = scan.nextInt();
//			System.out.println("1번째 Y좌표를 입력하세요.");
//			in_point[i].y = scan.nextInt();
		}
		
//		Point[] p = {new Point(in_point[0].x,in_point[0].y),
//				//객체에 있는 
//				new Point(in_point[1].x,in_point[1].y),
//				new Point(in_point[2].x,in_point[2].y)};
		Point[] p = {in_point[0],in_point[1],in_point[2]};
							
		Triangle t1 = new Triangle(p);
		
		//좌표 출력
		t1.triangle_point();
				
		//좌표 길이
		t1.triangle_length();
		
		//삼각형 넓이
		t1.triangle_area();
		}//main
	}//class


