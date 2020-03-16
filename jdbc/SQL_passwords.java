package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
public class SQL_passwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8"
					,"root","admin");
					Statement s = c.createStatement()){
				String name ="dashen";
				String password = "thisispassword1";
				String sql = "select * from user name where name = '"+name+"'and password = '"+password+"'";
				ResultSet rs = s.executeQuery(sql);
				
				if(rs.next()) {
					System.out.println("ÕýÈ·");
					
				}else {
					System.out.println("cuowu");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
