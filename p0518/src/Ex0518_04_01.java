import java.util.Scanner;

public class Ex0518_04_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 객체 주소 선언
		Student2[] s = new Student2[10];
		String search_name = "";
		int search_num = -1;

		loop1:while (true) {
			
			mainPrint();
			int choice = scan.nextInt();

			switch (choice) {
			case 1:// 1. 학생성적 추가
				stuInput(s);
				
				break;
			case 2: // 2. 학생성적 출력

				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println(("========================================"));
				for (int i = 0; i < Student2.count; i++) {
					System.out.print(s[i].stu_number + "\t");
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f\t", s[i].avg);
					System.out.print(s[i].rank + "\n");

				}
				break;
			case 3:// 3. 학생성적수정
				System.out.println("수정할 학생의 이름을 입력하세요>>");
				search_name = scan.next();

				search_num = search_num-1; // 검색데티어가 있는지 확인하는 변수
				System.out.println("[검색된 학생 이름]");
				for (int i = 0; i < Student2.count; i++) {
					if (s[i].name.contains(search_name)) {
						System.out.println(i + ". " + s[i].name);
						// 출력
						// 0.홍길동
						// 1.홍길자
						// 2.홍길순
						search_num = 0;
					}
				}
				// 없을경우
				if (search_num == -1) {
					System.out.println("찾을 데이터가 없습니다.");
					break;
				}
				// 있을경우
				System.out.println("수정하고 싶은 학생의 번호를 입력하세요.>>");
				int temp_num = scan.nextInt();// 원하는 학생번호

				// 수정할 과목 선택
				System.out.println("[수정할 과목 선택]");
				System.out.println("0.국어    1.영어     2.수학");
				System.out.println("수정할 과목 번호를 입력하세요.>>");
				int temp_num2 = scan.nextInt();
				// 과목별 수정
				switch (temp_num2) {
				case 0:
					System.out.println("현재점수 : " + s[temp_num].kor);
					System.out.println("수정할 점수 입력하세요.>>");
					// 점수수정
					s[temp_num].kor = scan.nextInt();
					break;

				case 1:
					System.out.println("현재점수 : " + s[temp_num].kor);
					System.out.println("수정할 점수 입력하세요.>>");
					// 점수수정
					s[temp_num].eng = scan.nextInt();
					break;
				case 2:
					System.out.println("현재점수 : " + s[temp_num].kor);
					System.out.println("수정할 점수 입력하세요.>>");
					// 점수수정
					s[temp_num].math = scan.nextInt();
					break;
				}
				// 합계수정
				s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
				s[temp_num].avg = s[temp_num].total / 3.0;

				break;
			case 4:// 4. 학생성적검색
				System.out.println("검색할 학생의 이름을 입력하세요.>>");
				search_name = scan.next();

				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println(("========================================"));

				search_num = -1; // 검색데이터가 있는지 확인하는 변수
				for (int i = 0; i < Student2.count; i++) {
					if (s[i].name.contains(search_name)) {
						// 출력
						System.out.print(s[i].stu_number + "\t");
						System.out.print(s[i].name + "\t");
						System.out.print(s[i].kor + "\t");
						System.out.print(s[i].eng + "\t");
						System.out.print(s[i].math + "\t");
						System.out.print(s[i].math + "\t");
						System.out.print(s[i].total + "\t");
						System.out.printf("%.2f\t", s[i].avg);
						System.out.print(s[i].rank + "\n");
						search_num = 0; // 데이터가 있을경우 0으로 변경된다. 없을경우는 -1이 된다 .
					}

				}
				// 없을경우
				if (search_num == -1) {
					System.out.println("찾을 데이터가 없습니다.");
				}

				break;
			case 5:// 5. 등수처리
				for(int i=0; i<Student2.count;i++) {
					int rankNum=1; // 등수 카운트
					for(int j=0; j<Student2.count;j++) {
						if(s[i].total<s[j].total) {
							rankNum++;
						}
					}
					s[i].rank = rankNum;
				}
				System.out.println("등수처리가 완료되었습니다.");

				break;
			case 0:// 0. 프로그램종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			
			default:
				break;

			}

		}

	}// main 
	 //main 출략화면 보드
	static void mainPrint()  {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램종료 ");
		System.out.println("-------------------------------");
		System.out.println("원하는 번호를 입력하세요");
	}
	static void stuInput(Student2[] s) {
		for (int i = Student2.count; i < s.length; i++) {
			// 객체 s[i]에 객체 선언
			System.out.println("이름을 입력하세요>>(0.상위메뉴이동)");
			String check = scan.next();

			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}
			// 객체 s[i]에 객체 선언
			s[i] = new Student2(); // 저장 객체 생성 번호는 자동으로 입력됨
			s[i].name = check;
			System.out.println("국어점수를 입력하세요>>");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요>>");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요>>");
			s[i].math = scan.nextInt();
			// 합계
			s[i].total = s[i].kor + s[i].eng + s[i].math;
			// 평균
			s[i].avg = s[i].total / 3.0;

		}
		
	}
	

}// class
