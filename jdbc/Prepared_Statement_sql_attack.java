package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Prepared_Statement_sql_attack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			String sql = "select * from hero where name = ?";
			try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");
					Statement s = c.createStatement();
					PreparedStatement ps = c.prepareStatement(sql))
				{
				// ����name���û��ύ��������
				String name = "'����'OR 1=1";
				String sql0 = "select * from hero where name = "+name;
				 // ƴ�ӳ�����SQL������
	            // select * from hero where name = '����' OR 1=1
	            // ��Ϊ��OR 1=1�����Ժ����
	            // ��ô�ͻ�����е�Ӣ�۶������������ֻ�Ǹ���
	            // ���Hero����������Ǻ����ģ����缸����������������������ȫ�������
	            // �������ݿ⸺�ر�ߣ�CPU100%���ڴ����Ĺ⣬��Ӧ��ü��仺��
	            System.out.println(sql0);
	            ResultSet rs0 = s.executeQuery(sql0);
	            while(rs0.next()) {
	            	String heroname = rs0.getString("name");
	            	System.out.println(heroname);
	            }// ʹ��Ԥ����Statement�Ϳ��Զž�SQLע��
	            System.out.println("**************************");
	            	ps.setString(1,name);
	            	ResultSet rs = ps.executeQuery();
	            	while(rs.next()) {// �鲻�����ݳ���
	            		String heroname = rs.getString("name");
	            		System.out.println(heroname);
	            	}
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
	}

}
