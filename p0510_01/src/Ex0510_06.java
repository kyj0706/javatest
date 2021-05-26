import java.util.Scanner;

public class Ex0510_06 {

	public static void main(String[] args) {
		//97점 이상 A+
		//94~96 A
		//90~93 A-
		//87이상 B+
		//84~86 B
		//80~83 B-
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("점수를 입력하세요. >>");
		int score = scan.nextInt();
		
    String grade;
        
        //중첩 if문 사용 
        if (score >= 90) {
            grade = "A";
            
            if (score >= 97) {
                grade += "+"; 
            } else if (score < 94) {
                grade += "-";
            } else {
                
            }
        } else if (score >= 80 && score < 90) {
            grade = "B";
            if (score >= 87) {
                grade += "+";
            } else if (score < 84) {
                grade += "-";
            } else {
                
            }
        } else if (score >= 70 && score < 80) {
            grade = "C";
            if (score >= 77) {
                grade += "+";
            } else if (score < 74) {
                grade += "-";
            } else {
            
            }
        } else if (score >= 60 && score < 70) {
        	grade = "D";
        	if (score >= 67) {
        		grade += "+";
        	} else if (score < 64) {
        		grade += "-";
        	} else {
        		
        	}
        } else {
            grade = "F";
        }
        

        System.out.println("점수는  : " + score);
        System.out.println("당신의 학점은 : " + grade );
		
		
		//점수를 입력받아 
		// 90이상이면 A, 80->B, 70->C, 60->D ,F
		//97/10=(int)9.7=9
		//81/10=(int)8.1=8
		// 91 점 부터 100 점 까지 ? ..?
//			num = num / 10;
//		
//		switch (num) {
//		case 9:
//			System.out.println("A");			
//			break;
//		case 8:
//			System.out.println("B");			
//			break;
//		case 7:
//			System.out.println("C");			
//			break;
//		case 6:
//			System.out.println("D");			
//			break;
//		default:
//			System.out.println("F");			
//			break;
//		
//
//		}
		
		
		
		
		
//		if(num >=90) {
//			System.out.println("A");
//		}else if(num >=80) {
//			System.out.println("B");
//		}else if(num >=70) {
//			System.out.println("C");
//		}else if(num >=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
			
		
		
//		System.out.println("국번을 입력하세요. >>");
//		int num = scan.nextInt();
//		
//		//int num=7;
//		if(num==1 || num==7) {
//			System.out.println("SK");
//		}else if(num==6) {
//			System.out.println("KT");
//		}else if(num==9) {
//			System.out.println("LG");
//		}else {
//			System.out.println("통신사 없음");
//		}

	}

}
