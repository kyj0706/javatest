package p0616;

public class Ex0616_03 {

	public static void main(String[] args) {
		String str = "1,홍길동,100,100,100,300,100";
		System.out.println("문자열 :" +str);
		//split : 입력한 문자 를(을)기준으로 배열에 넣어준다 
		//ex) [0] = 1, [1]= 홍길동 
		String[] strArr = str.split(",");
		System.out.println("NO :" +strArr[0]);
		System.out.println("이름 :" +strArr[1]);
	}

}
