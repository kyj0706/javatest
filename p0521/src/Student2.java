
public class Student2 {
	//클래스변수
	static int count; // 객체 생성없이 사용 가능
	//인스턴스변수
	String stu_number; // 객체생성을해야 사용가능
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	{
		//stu_number = "S" + String.format("%03d", ++count);
		count++;
		stu_number = "S"+count;
	}
	//기본생성자
	Student2(){}
	//매개변수가 있는 생성자
	Student2(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		
		
	}
	
}
