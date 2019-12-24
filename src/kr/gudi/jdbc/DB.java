package kr.gudi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB {
	
	private Connection conn;
	private boolean status;
	private final String URL = "jdbc:mariadb://mariadb:3306/gdj21";
	private final String ID = "gdj21";
	private final String PWD = "1234";
	
	public Connection 접속() {		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			return DriverManager.getConnection(URL, ID, PWD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Integer> 실행(String sql) {
		List<Integer> arr = new ArrayList<Integer>();
		try {
			conn = 접속();
			if(conn != null) {
				Statement stat = conn.createStatement();
				status = stat.execute(sql);
				ResultSet rs = stat.executeQuery(sql);
				
				while(rs.next()) {
					int num = rs.getInt(1);
					arr.add(num);
				}
				rs.close();
				stat.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arr;
	}
	
	public void 결과(List<Integer> result) {
		if(status) {
			System.out.println("성공");
			
			for(int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
			
		} else {
			System.out.println("실패");
		}
	}

}
