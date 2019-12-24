package kr.gudi.jdbc;

public class Main {

	public static void main(String[] args) {
		/***************************************************
		 * JDBC : java + database
		 * database 접속 : 호스트(주소), 포트, 계정, 비밀번호
		 * java 준비물 : jdbc 드라이버(라이버리) database별 파일관리
		 * 
		 * 1) 접속 (데이터베이스)
		 * 2) SQL (질의어를 실행)
		 * 3) 결과 확인
		 ***************************************************/
		DB db = new DB();
		db.접속();
		
		db.실행();
		
		db.결과();
		
	}

}
