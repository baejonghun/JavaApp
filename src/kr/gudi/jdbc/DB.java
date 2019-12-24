package kr.gudi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public List<Object[]> 실행(String sql) {
		List<Object[]> arr = new ArrayList<Object[]>();
		try {
			conn = 접속();
			if(conn != null) {
				Statement stat = conn.createStatement();
				status = stat.execute(sql);
				ResultSet rs = stat.executeQuery(sql);
				ResultSetMetaData rsmd = rs.getMetaData();
				int colSize = rsmd.getColumnCount();

				while(rs.next()) {
					Object[] objs = new Object[colSize];
					for(int i = 1; i <= colSize; i++) {
						String name = rsmd.getColumnName(i);
						Object value = rs.getObject(i);
						objs[i - 1] = value;
					}
					arr.add(objs);
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
	
	public void 결과(List<Object[]> result) {
		if(status) {
			System.out.println("성공");
			
			for(int i = 0; i < result.size(); i++) {
				Object[] objs = result.get(i);
//				System.out.println(objs);
				for(int j = 0; j < objs.length; j++) {
					System.out.print(objs[j] + "\t");
				}
				System.out.println("");
			}
			
		} else {
			System.out.println("실패");
		}
	}

}
