package kr.gudi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	private Connection conn;
	private boolean status;
	
	public void 접속() {
		String url = "jdbc:mariadb://mariadb:3306/gdj21";
		String id = "gdj21";
		String pwd = "1234";
		
		try {
			System.out.println("드라이버 확인");
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 있음");
			
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 객체 생성");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 없음");
		}
		
	}
	
	public void 실행() {
		String sql = "SELECT num FROM test";
		try {
			System.out.println("실행 시작");
			Statement stat = conn.createStatement();
			System.out.println(sql);
			status = stat.execute(sql);
			System.out.println("실행 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void 결과() {
		if(status) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}

}
