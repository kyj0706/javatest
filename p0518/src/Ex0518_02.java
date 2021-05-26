import java.util.Scanner;

public class Ex0518_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생 5명을 선언해보세요
		
		//객체 배열선언 
		Student[] s = new Student[3];  // 객체의 주소만 생성
//		s[0] = new Student(); // 객체의 저장공간 생성 
//		s[1] = new Student();
//		s[2] = new Student();

		for(int i=0; i<s.length;i++) {
			s[i] = new Student();
			System.out.println("이름을 입력하세요");
			s[i].name = scan.next();
			
			for(int j=0; j<s[0].score.length; j++) {
				System.out.println("점수를 입력하세요");
				s[i].score[j] = scan.nextInt();
				//합계
				s[i].total = s[i].score[0] +s[i].score[1] +s[i].score[2];
				//평균
				s[i].avg = s[i].total/3.0;
			}
			
		}
		for(int i=0; i<s.length;i++) {
			
			System.out.print(s[i].stu_number+"\t");
			System.out.print(s[i].name+"\t");			
			for(int j=0; j<s[0].score.length; j++) {
				System.out.print(s[i].score[j]+"\t");
				//합계.
			}
			System.out.print(s[i].total+"\t");
			System.out.println(s[i].avg+"\t");
			
		}
		
		
//		s[0].total = s[0].kor+s[0].eng+s[0].math;
//		s[0].avg = s[0].total/3.0;
		
		
		
		
		//각각 선언
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
	}

}
