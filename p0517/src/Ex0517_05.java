
public class Ex0517_05 {

	public static void main(String[] args) {

		String str = new String();
		// 갹채선언 또는 객체생성
		Tv t = new Tv();
		t.channel1 = 7;

		System.out.println(t.channel1);
		System.out.println(t.power);
		t.power();
		t.channel1Down();

		System.out.println("power후 : "+t.power);
		System.out.println("down후 : " + t.channel1);

	}

}
