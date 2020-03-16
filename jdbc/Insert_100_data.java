package jdbc;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Insert_100_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root","admin");
					Statement s = c.createStatement()){
				for(int i= 0;i<100;i++) {
					String sql = "insert into hero values(null," + "'hero"+i+"'"+ "," + 313.0f + "," + 50 + ")";
					s.execute(sql);
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	

}
