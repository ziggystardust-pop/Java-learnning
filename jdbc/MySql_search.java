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
        	// ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
        	String sql = "select * from hero";
        	ResultSet rs = s.executeQuery(sql);
        	while(rs.next()) {
        		int id = rs.getInt("id");// ����ʹ���ֶ���
        		String name = rs.getString(2);// Ҳ����ʹ���ֶε�˳��
        		float hp = rs.getFloat("hp");
        		int damage = rs.getInt(4);
        		System.out.printf("%d\t%s\t%f\t%d\n",id,name,hp,damage);
        	}
        	 // ��һ��Ҫ������ر�ReultSet����ΪStatement�رյ�ʱ�򣬻��Զ��ر�ResultSet
            // rs.close();
        }catch(SQLException e) {
        	e.printStackTrace();
        }
	}

}
