
public class Ex0520_09 {

	public static void main(String[] args) {
		int[] aa= new int[5];
		
		//객체선언 
		MyMath2 mm = new MyMath2();
		mm.a=200;
		mm.b=100;
		
		//인스턴스 매소드
		long c = mm.add();
		System.out.println(c);
		
		//클래스매소드
		long d = MyMath2.add(mm.a, mm.b);
		System.out.println(d);
		
	}

}
