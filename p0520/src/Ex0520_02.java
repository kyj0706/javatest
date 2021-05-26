
public class Ex0520_02 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main x : "+ d.x);
		change(d);
		System.out.println("change main x"+ d.x);
	}
	//참조형변수
	static void change(Data d) { // 값을 d.x를 바라보기때문에 둘다 바뀐다.
		d.x = 1000;
		System.out.println("change x :" + d.x);
	}

}
