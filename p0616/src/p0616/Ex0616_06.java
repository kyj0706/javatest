package p0616;

public class Ex0616_06 {
	
	//main 메소드 /리턴타입 /이름 / 매개변수
	public static void main(String[] args) {
		
		String str = "hellow";
		str.charAt(2);
		
		String str2 = "789450";
		char ch = str2.charAt(0);
		System.out.println("ch char :" + ch);
		//ch -> int 로 변경하는 방법
		int num = ch-'0'; //7-> 55-48=7  
		int num2 = 8; //String 변경 방법  8+"" = "8"
		
		//str2.substring(0,3);
		System.out.println("str2.substring : "+str2.substring(0,3));
		
		
		String str3 ="자바수업이 끝나가고 있습니다.";
		System.out.println(str3.substring(0, 6));
		System.out.println(str3.substring(11, 16));
		
//		char a =' ';//사이띄우기 필수
//		String str ="";//빈공백이 데이터에 저장
//		String str2=null;//공백 조차도 없는 녀석 
//		
//		//s1,s2,s3은 같은 공같은 사용
//		String s1 = "";
//		String s2 = "";
//		String s3 = "";
//		
//		//s4,s5,s6 다른 공간
//		String s4 = new String("");
//		String s5 = new String("");
//		String s6 = new String("");
	}

}
