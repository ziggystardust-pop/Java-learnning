package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Transaction_be_used {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");Statement s = c.createStatement()){
			 // �������ǰ����
            // �������еĶ��������Ҫô���ɹ���Ҫô��ʧ��\
			c.setAutoCommit(false);
			 // ��Ѫ��SQL
			String sql0 = "updtae hero set hp = hp+1 where id = 6";
			s.execute(sql0);
			 // ��Ѫ��SQL  // ��С��д��д���� updata(����update)
            String sql2 = "updata hero set hp = hp -1 where id = 22";
            s.execute(sql2);
            c.commit();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
