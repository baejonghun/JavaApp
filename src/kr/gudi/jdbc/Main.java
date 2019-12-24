package kr.gudi.jdbc;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		DB db = new DB();
//		db.접속();
		String sql = "SELECT * FROM addr";
		List<Object[]> result = db.실행(sql);
		db.결과(result);		
	}

}
