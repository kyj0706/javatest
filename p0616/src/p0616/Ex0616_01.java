package p0616;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0616_01 {

	public static void main(String[] args) {

		// 폴더생성
		File dir1 = new File("c:/temp01/directory");
		if (!dir1.exists()) {
			dir1.mkdirs();
		}
		// 파일생성
		File file1 = new File("c:/temp01/file1.txt");
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 글자 입력하기(저장)
		try {
			FileWriter fw = new FileWriter(file1,true);
			String str = "다음 수업은 jsp웹 프로그래밍입니다 \n 다음주 화요일 쯔음 ?";
			fw.write(str + "\r\n");
			// \r은 마지막을로 이동하여 줄바꿈
			// \n은 줄마꿈
			fw.flush(); // 버퍼에 기록되어있는 내용을 모두 저장시키는 명령어
			fw.close(); // 무조건 닫이줘야한다.
			System.out.println("글자가 저장되었습니다 .");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 글자읽기
		try {
			Scanner scan = new Scanner(file1); 
			//System.in 화면으로 입력 , File 파일로 입력
			String str = "";
			while(scan.hasNextLine()) {
				str = str + scan.nextLine()+"\n";
//				scan.nextLine(); //엔터키 전까지 한줄을 입력받는 것
//				scan.next(); // 사이 띄우기 전까지 한단어 입력받는 것
//				scan.nextInt(); //정수 입력받는 것 				
			}
			
			File file2 = new File("c:/temp01/file2.txt");
			if (!file2.exists()) {
				 file2.createNewFile();
			} 
			FileWriter fw2 = new FileWriter(file2);
			fw2.write(str);
			fw2.flush();
			fw2.close();
			
		}catch (IOException e) {e.printStackTrace();}
			
			
		
		
	}
}
