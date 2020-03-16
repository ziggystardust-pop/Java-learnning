package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Execute_executeupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");
					Statement s = c.createStatement()	){
					String sqlinsert = "insert into hero values (null,'盖伦',616,100)";
					String sqldelete = "delete from hero where id = 10";
					String sqlupdate = "update hero set hp = 300 where id = 100";
					s.execute(sqlinsert);
					s.execute(sqldelete);
					s.execute(sqlupdate); // 相同点：都可以执行增加，删除，修改
					s.executeUpdate(sqlupdate);
//					   s.executeUpdate(sqlInsert);
//			            s.executeUpdate(sqlDelete);
//			            s.executeUpdate(sqlUpdate);
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
