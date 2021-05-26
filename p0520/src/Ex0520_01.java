
public class Ex0520_01 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main x :"+ d.x);
		change(d.x);
		System.out.println("change main x: "+d.x);
	}
	//지역변수
	static void change(int x) { //메서드로 갔다오면 사라진다.
		x=1000;
		System.out.println("change x : "+ x);
	}

}
