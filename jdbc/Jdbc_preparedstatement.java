package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc_preparedstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			String sql = "insert into hero values(null,?,?,?)";
			try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF8","root","admin");
					PreparedStatement ps = c.prepareStatement(sql);){
				ps.setString(1,"timo");
				ps.setFloat(2, 313.0f);
				ps.setInt(3,66);
				ps.execute();
				
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
