package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Mysql_crud_train {

	public static void  execute(String sql) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8",
                "root", "admin");
				Statement s = c.createStatement()) {
			s.execute(sql);
	}catch(SQLException e){
		e.printStackTrace();
	}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			execute("delete from hero where id = 4");
	}

}
