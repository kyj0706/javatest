package p0616;

public class Ex0616_04 {

	public static void main(String[] args) {
		
		String str ="aaa";
		String str2 = "aaa";
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		//
		
		if(str==str2) {
			System.out.println("같은데이터");
		}else {
			System.out.println("다른데이터");
		}
		
		if(str3==str4) {
			System.out.println("str3, str4 같은데이터");
		}else {
			System.out.println("str3, str4 같은데이터?");
		}
		
		
		//객체는 서로 바라볼수 없다 .
		// ==는  같은 주소안에서 비교하는것이다 .
		// equals는 같은 데이터가 있는지 비교해주는 것이다 .
//		Person p1 = new Person();
//		p1.id=880101110555L;
//		Person p2 = new Person();
//		p2.id=880101110555L;
//		
//		if(p1==p2) {
//			System.out.println("같은 데이터입니다.");
//		}else {
//			System.out.println("다른데이터입니다.");
//		}
//		if(p1.equals(p2)) {
//			System.out.println("equals비교 같은데이터입니다.");
//		}else {
//			System.out.println("equals비교 다른데이터입니다.");
//		}
	}

}
