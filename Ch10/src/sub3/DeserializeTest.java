package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\Apple.dat";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 가져오기
			Apple apple = (Apple) ois.readObject();
			
			// 스트림 해제
			ois.close();
			fis.close();
			
			apple.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("역직렬화 완료...");
	}
}
