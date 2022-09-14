package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜: 2022/09/14
 * 이름: 김재준
 * 내용: JDBC 실습하기
 */
public class JDBCTest {
	public static void main(String[] args) {
		
		// DB정도
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
		
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터베이스 접속 테스트 완료...");
	}
}
