package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");Statement s = c.createStatement()){
				 //û�������ǰ����
	            //����ҵ�����ʱ����Ѫ����Ѫ����һ��
	            //������Ӣ�۵�Ѫ������
	            //��Ѫ��SQL
				String sql0 = "update hero set hp = hp+1 where id = 6";
				s.execute(sql0);
				//��Ѫ��SQL
	            //��С��д��д���� updata(����update)
				String sql1 = "updata hero set hp = hp-1 where id = 6";
				s.execute(sql1);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
