
public class Ex0521_01 {

	public static void main(String[] args) {
		// 기본생성자를 사용 하여 객체 3개를 생성 하시오
		// white,auto,4 / pink,auto,5 /silver,auto,4/
		// white,auto,4 / black,auto,5 /white,auto,4/
		// white,auto,4 / green,auto,5 /white,auto,4/
		//

		Car[] c = new Car[10];
		
		c[0] = new Car();
		c[1] = new Car("pink", "auto", 5);
		c[2] = new Car("silver", "auto", 4);
		c[3] = new Car();
		c[4] = new Car("black", "auto", 4);
		c[5] = new Car();
		c[6] = new Car();
		c[7] = new Car("green", "auto", 5);
		c[8] = new Car();
		
		
//		Car c1 = new Car();
//		Car c2 = new Car("pink", "auto", 5);
//		Car c3 = new Car("silver", "auto", 4);
//		Car c4 = new Car();
//		Car c5 = new Car("black", "auto", 4);
//		Car c6 = new Car();
//		Car c7 = new Car();
//		Car c8 = new Car("green", "auto", 5);
//		Car c9 = new Car();

		//System.out.println(c1.color);

//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;

	}

}
