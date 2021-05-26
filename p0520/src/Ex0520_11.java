
public class Ex0520_11 {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		System.out.println(d1.value);
		//안된다.
		Data2 d2 = new Data2();
		//Data2 d2 = new Data2(1); //매개 변수 하나를 만들어 보내던지 
		System.out.println(d2.value);

	}

}//class
