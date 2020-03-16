package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc_ORM {

	public static Hero get(int id) {
		Hero hero = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8",
	                "root", "admin");Statement s = c.createStatement()){
			String sql = "select * from hero where id = "+id;
			ResultSet rs = s.executeQuery(sql);
			 // 因为id是唯一的，ResultSet最多只能有一条记录
            // 所以使用if代替while
			if(rs.next()) {
				hero = new Hero();
				String name = rs.getString(2);
				float hp = rs.getFloat(3);
				int damage = rs.getInt(4);
				hero.name = name;
				hero.damage = damage;
				hero.hp = hp;
				hero.id = id;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return hero;
	}
	public static void add(Hero h) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "insert into hero values(null,?,?,?)";
		try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8",
	                "root", "admin");PreparedStatement ps = c.prepareStatement(sql)){
				ps.setString(1,h.name);
				ps.setFloat(2,h.hp);
				ps.setInt(3,h.damage);
				ps.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Hero h = get(22);
				System.out.println(h.name);
	}

}
