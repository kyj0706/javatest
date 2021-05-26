package pack01;

public class Ex0526_03 {

	public static void main(String[] args) {
		Car c = null;
		//객체선언
		FireEngine f1 = new FireEngine();
		FireEngine f2 = null;
		
		f1.water();
		
		//f1의 객체선언  
		c=f1;  // 저장 공간이 만들어 졌다
//안됨   c.water(); // f1에서 c 변경되면서 명령어는 Car에 있는 것만 사용됨 
		f2 =(FireEngine) c;
		f2.water();
		
		
		//사용가능 
//		Car c2 = new FireEngine(); //다형성 
//		Car c3 = new FireEngine(); //다형성 
//		Car c4 = new Ambulance();
		
		
		
	}

}
