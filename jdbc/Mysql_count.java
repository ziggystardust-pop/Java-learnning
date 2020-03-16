package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Mysql_count {
	public static void main(String[] args) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			try(Connection c= DriverManager.getConnection("jdbc:mysql://127.0."
					+ "0.1:3306/how2jjava?characterEncoding=UTF-8","root",
					"admin");Statement s  = c.createStatement()
					) {
				String sql = "select count(*)from hero";
				ResultSet rs = s.executeQuery(sql);
				int total = 0;
				while(rs.next()) {
					total = rs.getInt(1);
				}
				 System.out.println("表Hero中总共有:" + total+" 条数据");
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
