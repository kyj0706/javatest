package p0616;

public class Ex0616_05 {

	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동",100,100,100);
		Student s2 = new Student(2,"이순신",90,90,90);
		
		//입력된 데이터를 출력하시요
		 
		System.out.println("NO :"+s1.getStuNo());
		System.out.println("이름 :"+s1.getName());
		System.out.println("국어 :"+s1.getKor());
		System.out.println("영어 :"+s1.getEng());
		System.out.println("수학 :"+s1.getMath());
		System.out.println("========================");
		System.out.println("NO :"+s2.getStuNo());
		System.out.println("이름 :"+s2.getName());
		System.out.println("국어 :"+s2.getKor());
		System.out.println("영어 :"+s2.getEng());
		System.out.println("수학 :"+s2.getMath());
		System.out.println("=====================");
		//toString 을 꼭 override 를 꼭해 줘야한다 .
		System.out.println(s1.toString());
		System.out.println(s2); //객체를 출력할 때는 toString 을 생략하도 된다 .
		
		System.out.println("==========================");
		//class 정보 출력 (자신의 속한 객체를 반환하는 메서드)
		System.out.println("클래스 이름이 뭐데?"+s1.getClass().getName());
		
	}

}
