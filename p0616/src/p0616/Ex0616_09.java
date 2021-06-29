package p0616;

public class Ex0616_09 {

	public static void main(String[] args) {
		String[] fileName = {"file1.txt","file2.hwp","file3.psd","file1.4pg" 
				,"file5.ppt","file6.doc","file8.java"
		};
		
		String[] fileName2 = {"ff.hwp","ff2.java","ff3.doc"
		};
		
		
		
		String str = "file1.txt";
		if(str.endsWith("txt")) {
			System.out.println("텍스트 문서파일입니다.");
		}else {
			System.out.println("텍스트 문서파일이 아닙니다.");
		}
	}

}
