//package SqlTest;
//
//import java.sql.*;
//
//public class Main {
//	public static void main(String[]args) {
//		String driver ="oracle.jdbc.driver.OracleDriver";
//		String url ="jdbc:oracle:thin:@localhost:1521:xe";
//		String user ="c##himedia";
//		String password = "himedia";
//		
//		try {
//			Class.forName(driver);
//			System.out.println("jdbc driver loading success.");
//			Connection conn = DriverManager.getConnection(url,user,password);
//			System.out.println("oracle connection success.\n");
//			
//			Statement stmt =conn.createStatement();
//			
//			String sql = "SELECT * FROM dept";
//			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				System.out.print(rs.getString("deptno")+" ");
//				System.out.print(rs.getString("dname")+" ");
//				System.out.println(rs.getString("loc")+" ");
//			}
//			
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println("jdbc driver loading fail.");
//			e.printStackTrace();
//		}
//		catch(SQLException e) {
//			System.out.println("oracle connection fail.");
//			e.printStackTrace();
//		
//		}
//	}
//
//}












package SqlTest;

import java.sql.*;

public class Main {
	public static void main(String[]args) {
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user ="c##himedia";
		String password = "himedia";
		
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url,user,password);
			System.out.println("oracle connection success.\n");
			Statement stmt =conn.createStatement();
			
			String sql3 = "SELECT MAX(DEPTNO) FROM DEPT";
			ResultSet rs2 = stmt.executeQuery(sql3);

			String ret = "";
			int iRet = 0;
			while (rs2.next()) {
//				System.out.print(rs2.getString("MAX(DEPTNO)") + " ");
				ret = rs2.getString("MAX(DEPTNO)");
				iRet = rs2.getInt("MAX(DEPTNO)");
			}

			int ideptret = Integer.parseInt(ret);
			ideptret += 10;
			iRet += 10;
			System.out.println(iRet);
			String strdept = Integer.toString(ideptret);
			
			String ideptno=strdept, sdname ="IT", sloc ="SEOUL";
			
			String sql ="INSERT INTO dept VALUES ('"+ideptno + "','" +sdname + "','" +sloc+"')";
			
			boolean b =stmt.execute(sql);
			if(!b) {
				System.out.println("Insert success.\n");
				
			}else {
				System.out.println("Insert fail.\n");
			}
			
			String sq12 ="SELECT deptno, dname, loc FROM dept";
					ResultSet rs =stmt.executeQuery(sq12);
			while(rs.next()) {
				System.out.print(rs.getString("deptno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.println(rs.getString("loc")+" ");
			}
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("oracle connection fail.");
			e.printStackTrace();
		
		}
	}

}
