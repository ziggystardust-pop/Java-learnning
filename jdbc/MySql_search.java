package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MySql_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8",
                "root", "admin"); Statement s = c.createStatement();) {
        	// 执行查询语句，并把结果集返回给ResultSet
        	String sql = "select * from hero";
        	ResultSet rs = s.executeQuery(sql);
        	while(rs.next()) {
        		int id = rs.getInt("id");// 可以使用字段名
        		String name = rs.getString(2);// 也可以使用字段的顺序
        		float hp = rs.getFloat("hp");
        		int damage = rs.getInt(4);
        		System.out.printf("%d\t%s\t%f\t%d\n",id,name,hp,damage);
        	}
        	 // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
            // rs.close();
        }catch(SQLException e) {
        	e.printStackTrace();
        }
	}

}
