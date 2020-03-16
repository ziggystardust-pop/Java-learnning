package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class Close_Try_with_resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root","admin");Statement s =c.createStatement())
				{
					String sql = "insert into hero values(null," + "'ÌáÄª'" + "," + 313.0f + "," + 50 + ")";
					s.execute(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
