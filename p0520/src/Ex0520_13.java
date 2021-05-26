import java.util.Scanner;

public class Ex0520_13 {

	public static void main(String[] args) {
		// 10명 학생 성청 추가

		Scanner scan = new Scanner(System.in);

		Student[] s = new Student[10];

		System.out.println("학생성적 추가");

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.println("이름을 입력하세요");
			s[i].name = scan.next();
			System.out.println("국어점수를 입력하세요");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			s[i].math = scan.nextInt();
			s[i].total = s[i].kor + s[i].eng + s[i].math;
			s[i].avg = s[i].total / 3.0;

		}
	}

}
