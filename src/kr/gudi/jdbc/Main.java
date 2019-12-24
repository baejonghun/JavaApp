package kr.gudi.jdbc;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		DB db = new DB();
//		db.접속();
		String sql = "SELECT num FROM test";
		List<Integer> result = db.실행(sql);
		db.결과(result);		
	}

}
