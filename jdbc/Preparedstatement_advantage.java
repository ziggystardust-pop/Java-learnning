package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Preparedstatement_advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			String sql = "insert into hero values(null,?,?,?)";
			
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");
					Statement s = c.createStatement();PreparedStatement ps = c.prepareStatement(sql)){
				// Statementִ��10�Σ���Ҫ10�ΰ�SQL��䴫�䵽���ݿ��
	            // ���ݿ�Ҫ��ÿһ������SQL�����б��봦��
				long start = System.currentTimeMillis();
				 for (int i = 0; i < 10000; i++) {
		                String sql0 = "insert into hero values(null," + "'��Ī'" + ","
		                        + 313.0f + "," + 50 + ")";
		                s.execute(sql0);
		            }
		            s.close();
		            long end = System.currentTimeMillis();
		            System.out.println(-start+end);
		         // PreparedStatement ִ��10�Σ�ֻ��Ҫ1�ΰ�SQL��䴫�䵽���ݿ��
		            // ���ݿ�Դ�?��SQL����Ԥ����
		  
		            // ÿ��ִ�У�ֻ��Ҫ������������ݿ��
		            // 1. ���紫������Statement��С
		            // 2. ���ݿⲻ��Ҫ�ٽ��б��룬��Ӧ����
		            long start1 = System.currentTimeMillis();
		            for(int i = 0;i<10000;i++) {
		            	ps.setString(1,"ff");
		            	ps.setFloat(2, 313.0f);
		                ps.setInt(3, 50);
		                ps.execute();
		            }
		            long end1 = System.currentTimeMillis();
		            System.out.println(-start1+end1);
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
