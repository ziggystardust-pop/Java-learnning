package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
   
public class Auto_increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		String sql = "insert into hero values(null,?,?,?)";
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");PreparedStatement ps = c.prepareStatement(sql)){
				ps.setString(1,"����");
				ps.setFloat(2,616);
				ps.setInt(3,100);
				ps.execute();// ִ�в������
				 // ��ִ�����������MySQL��Ϊ�²�������ݷ���һ��������id
	            // JDBCͨ��getGeneratedKeys��ȡ��id
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					System.out.println(id);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
