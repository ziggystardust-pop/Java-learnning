package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate_differant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");Statement s = c.createStatement()){
			String sqlresult = "select * from hero";	
				s.execute(sqlresult);
				// ��ͬ1��execute����ִ�в�ѯ���
	            // Ȼ��ͨ��getResultSet���ѽ����ȡ����
				ResultSet rs = s.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt("id"));
				}
				// executeUpdate����ִ�в�ѯ���
	            // s.executeUpdate(sqlSelect)
				 // ��ͬ2:
	            // execute����boolean���ͣ�true��ʾִ�е��ǲ�ѯ��䣬false��ʾִ�е���insert,delete,update�ȵ�
				boolean d = s.execute(sqlresult);
				System.out.println(d);
				String sqlupdate = "update hero set hp = 300 where id<100";
				int number = s.executeUpdate(sqlupdate);
				System.out.println(number);
			}catch(SQLException e) {
					e.printStackTrace();
				}
			
	}

}
